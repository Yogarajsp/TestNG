package org.group;

import org.testng.annotations.Test;

public class B {

	@Test(groups = "@smoke")
	public void tc11() {
		
		System.out.println("Test 11");
	}
	
	@Test(groups = {"@sanity","@regression"})
	public void tc22() {
		
		System.out.println("Test 22");
	}
	
	@Test(groups = "@regression")
	public void tc33() {
		
		System.out.println("Test 33");
	}
	
}
