package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(description="Login OrangeHRM")
	public void login()
	{
	System.out.println("Test Case login");
	}
	
	@Test(dependsOnMethods="login")
		public void search() {
	System.out.println("Test Case search");
	//Assert.assertEquals(actual, expected) is used to chk the actual and expected results
	Assert.assertEquals("xyz", "abc");
	}
	
	@Test(dependsOnMethods="search",alwaysRun=true)
	public void logout() {
	System.out.println("Test Case logout");
	}

}
