package org.testSample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class B {

	@Test
	private void tc11() {
		
		System.out.println("Test 11");
	}
	
	@Ignore
	@Test
	private void tc33() {
		
		System.out.println("Test 33");
	}
	
	@Test
	private void tc22() {
		
		System.out.println("Test 22");
	}
	
}
