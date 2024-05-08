package org.parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	public static WebDriver d;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String browserName) {
		
		if (browserName.equals("chrome")) {
			d = new ChromeDriver();
			
		}
		else if (browserName.equals("edge")) {
			d = new EdgeDriver();
			
		}
		else if (browserName.equals("FireFox")) {
			d = new FirefoxDriver();
			
		}
		else {
			d = new SafariDriver();
		}
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
	}
	
}
