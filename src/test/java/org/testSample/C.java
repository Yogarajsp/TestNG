package org.testSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {

	@Test
	private void tc222() {
		
		System.out.println("Test 222");
	}
	
	@Test
	private void tc333() {
		
		Assert.assertTrue(false);
		System.out.println("Test 333");
	}
	
	@Test(enabled=false)
	private void tc111() {
		
		System.out.println("Test 111");
	}
	
}
