package org.parameterisation;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojo.FaceBookloginPg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseClass{

	@Test(dataProvider = "userData")
	private void tc1(String user, String pass) {
		
		launchBrowser();
		maxBrowser();
		getUrl("https://www.facebook.com/");
		
		FaceBookloginPg f = new FaceBookloginPg();
		
		keys(f.getUserName(), user);
		keys(f.getPassWord(), pass);
		btn(f.getLogin());

	}
	
	@DataProvider(name = "userData")
	private String[][] data() throws IOException {
		
		return new String[][] {
			{excelRead(1, 0),excelRead(1, 1) },
			{"Java","Java@123"},
			{"Python","Python@123"},
			{"Selenium","Selenium@123"}
			
		};
	}
	
}
