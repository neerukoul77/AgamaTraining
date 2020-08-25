package com.TestNG;

import org.testng.annotations.Test;

public class dependsupongroup {
	public class PriortyTestCase {
		@Test(groups= {"Smoke", "Regression test"})
		public void TestCase1() {
		
		System.out.println("Test Case 1");
		}
		@Test(groups= {"smoke", "sanity"})
		public void TestCase2() {
			
			System.out.println("Test Case 2");
			}
		@Test(groups= {"Functional Testing", "Retesting"})
		public void TestCase3() {
			
			System.out.println("Test Case 3");
			}
}
}