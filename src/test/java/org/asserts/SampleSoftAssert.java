package org.asserts;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojo.FaceBookloginPg;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleSoftAssert extends BaseClass{

	@Test
	public void tc1() throws IOException {
		
		launchBrowser();
		maxBrowser();
		getUrl("https://www.facebook.com/");
		
		String url = d.getCurrentUrl();
		
		SoftAssert s = new SoftAssert();
		
		s.assertTrue(url.contains("facebookghjk"), "Check the url");
		
		FaceBookloginPg f = new FaceBookloginPg();
		
		keys(f.getUserName(), excelRead(1, 0));
		
		keys(f.getPassWord(), excelRead(1, 1));
		
		btn(f.getLogin());
		
		s.assertAll();
	}
	
}
