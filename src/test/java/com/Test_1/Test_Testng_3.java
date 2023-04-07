package com.Test_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Testng_3 {
	
	@Test(priority=1,invocationCount=2)
	public void xyz() {
		System.out.println("XYZ Test");
	}
	
	@Test(priority=0,enabled=false)
	public void abc() {
		System.out.println("ABC Test");
	}
	
	
	@Test(priority=-1)
	public void pqr() {
		System.out.println("PQR Test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods="pqr")
	public void tab() {
		System.out.println("TAB Test");
	}

}
