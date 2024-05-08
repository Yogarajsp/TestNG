package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationReRunMethod1 {

	@Test
	private void tc3() {
		
		System.out.println("Test 3");
	}
	
	@Test
	private void tc5() {
		
		System.out.println("Test 5");
	}
	
	@Test
	private void tc1() {
		
		System.out.println("Test 1");
	}
	
	@Test(retryAnalyzer = FailedMethod1.class)
	private void tc4() {
		
		Assert.assertTrue(false);
		System.out.println("Test 4");
	}
	
	@Test(retryAnalyzer = FailedMethod1.class)
	private void tc2() {
		
		Assert.assertTrue(false);
		System.out.println("Test 2");
	}
	
}
