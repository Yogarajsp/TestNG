package org.testSample;

import org.testng.annotations.Test;

public class A {

	@Test
	private void tc1() {
		
		System.out.println("Test 1");
	}
	
	@Test(invocationCount=5)
	private void tc3() {
		
		System.out.println("Test 3");
	}
	
	@Test
	private void tc2() {
		
		System.out.println("Test 2");
	}
}
