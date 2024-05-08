package org.parameterisation;

import org.baseclass.BaseClass;
import org.pojo.FaceBookloginPg;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClass{

	@Parameters({"username","password"})
	@Test
	private void tc1(String user, String pass) {
		
		launchBrowser();
		maxBrowser();
		getUrl("https://www.facebook.com/");
		
		FaceBookloginPg f = new FaceBookloginPg();
		
		keys(f.getUserName(), user);
		
		keys(f.getPassWord(), pass);
		
		btn(f.getLogin());
	}
	
	//@optinal method
	
	@Parameters({"Username","password"})
	@Test
	private void tc2(@Optional("CProgram")String user, String pass) {
		
		launchBrowser();
		maxBrowser();
		getUrl("https://www.facebook.com/");
		
		FaceBookloginPg f = new FaceBookloginPg();
		
		keys(f.getUserName(), user);
		
		keys(f.getPassWord(), pass);
		
		btn(f.getLogin());
	}
	
}
