package org.testSample;

import org.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	
	
	@BeforeClass
	private void launch() {
		
		System.out.println("LaunchBrowser");
	}
	
	@BeforeMethod
	private void starttime() {
		
		System.out.println("Start");
	}
	
	@AfterMethod
	private void endtime() {
	
		System.out.println("End");
	}
	
	@AfterClass
	private void closeweb() {
		
		System.out.println("CloseBrowser");
	}

	@Test(priority=-2)
	private void tc1() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority=-8)
	private void tc4() {
		
		System.out.println("Test 4");
	}
	
	@Test
	private void tc2() {
		
		Assert.assertTrue(false);
		System.out.println("Test 2");
	}
	
	@Test
	private void tc10() {
		
		Assert.assertTrue(true);
		System.out.println("Test 10");
	}
	
	@Test(invocationCount=5)
	private void tc3() {
		
		System.out.println("Test 3");
	}
	
	@Test(enabled=false)
	private void tc5() {
		
		System.out.println("Test 5");
	}
	
	@Test(enabled=true)
	private void tc8() {
		
		System.out.println("Test 8");
	}
	
	@Ignore
	@Test
	private void tc7() {
		
		System.out.println("Test 7");
	}
	
	@Test
	private void tc9() {
		
		System.out.println("Test 9");
	}
	
	@Test
	private void tc6() {
		
		System.out.println("Test 6");
	}
}
