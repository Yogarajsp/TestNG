package org.group;

import org.testng.annotations.Test;

public class C {

	
	@Test(groups = {"@smoke", "@sanity"})
	public void tc111() {
		
		System.out.println("Test 111");
	}
	
	@Test(groups = "@sanity")
	public void tc222() {
		
		System.out.println("Test 222");
	}
	
	@Test(groups = {"@regression", "@smoke"})
	public void tc333() {
		
		System.out.println("Test 333");
	}
}
