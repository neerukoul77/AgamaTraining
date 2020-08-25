package com.TestNG;

import org.testng.annotations.Test;

public class PriortyTestCase {
	@Test(priority=3)
	public void TestCase1() {
	
	System.out.println("Test Case 1");
	}
	@Test(priority=1)
	public void TestCase2() {
		
		System.out.println("Test Case 2");
		}
	@Test(priority=2)
	public void TestCase3() {
		
		System.out.println("Test Case 3");
		}
}
