package org.group;

import org.testng.annotations.Test;

public class A {

	@Test(groups = "@smoke")
	public void tc1() {
		
		System.out.println("Test 1");
	}
	
	@Test(groups = "@sanity")
	public void tc2() {
		
		System.out.println("Test 2");
	}
	
	@Test(groups = "@regression")
	public void tc3() {
		
		System.out.println("Test 3");
	}
}
