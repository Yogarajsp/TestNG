package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver d; 
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	

	public static void launchBrowser() {
		d = new ChromeDriver();	
	}
	
	public static void getUrl(String url) {
		d.get(url);
	}
	
	public static void maxBrowser() {
		d.manage().window().maximize();
	}
	
	public static void heading() {
		d.getTitle();
	}
	
	public static void pgUrl() {
		d.getCurrentUrl();
	}
	
	public static void keys(WebElement dev, String name) {
		dev.sendKeys(name);
	}
	
	public static void btn(WebElement ref) {
		ref.click();
	}
	
	public static void close() {
		d.close();
	}
	
	public static void quit() {
		d.quit();
	}
	
	public static void text(WebElement txt) {
		txt.getText();
	}
	
	public static String attribute(WebElement att) {
		String attribute = att.getAttribute("value");	
		return attribute;
	}
	
	public static void objAction() {
		a = new Actions(d);
	}
	
	public static void doubleTab(WebElement ref) {
		a.doubleClick(ref);
	}
	
	public static void rightClick(WebElement ref) {
		a.contextClick(ref);
	}
	
	public static void moveElement(WebElement ref) {
		a.moveToElement(ref);
	}
	
	public static void clickHold(WebElement ref) {
		a.clickAndHold(ref);
	}
	
	public static void objRobot() throws AWTException {
		r = new Robot();
	}
	
	public static void ent() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void tab() {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void up() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}	
	
	public static void down() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	
	public static void clickAll() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}
	
	public static void copy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	public static void paste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	public static void cut() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	
	public static void objJavaScript() {
		 js = (JavascriptExecutor) d;
	}
	
	public static void javaSendKeys(WebElement ref, String value) {
		js.executeScript(value, ref);
	}
	
	public static void javaClick(WebElement ref, String value) {
		js.executeScript(value, ref);
	}
	
	public static void objDropDown(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByValue(value);
	}
	
	public static String excelRead(int row, int cell) throws IOException {
		
		File file = new File("C:\\Users\\YOGARAJ S P\\eclipse-workspace\\FrameWork\\ExcelSheet\\FaceBookUsrPassExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Sheet1");
		
		Row r = s.getRow(row);
			
		Cell c = r.getCell(cell);
				
		int cellType = c.getCellType();
						
		String value;
					
		if (cellType == 1) {
			
				value = c.getStringCellValue();
					
					//System.out.println(value);
					
			}else if (DateUtil.isCellDateFormatted(c)) {
					
				Date d = c.getDateCellValue();
					
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					
				value = sim.format(d);
					
					//System.out.println(value);
					
			}else {
					
				double dd = c.getNumericCellValue();
					
				long l = (long) dd;
					
				value = String.valueOf(l);
					
					//System.out.println(value);	
				}
		
		return value;	
		
	}
	
}
 