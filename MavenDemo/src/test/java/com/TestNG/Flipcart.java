package com.TestNG;

import org.testng.annotations.Test;
import com.Testcases.WrapperMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Flipcart {
	WrapperMethod wm;
	@BeforeTest
	public void launchapp() {
		wm= new WrapperMethod();
		wm.insertapp("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		wm.enterbyname("q", " apple mobile");
		//wm.enterbyxpath("//button[@class=\'vh79eN\']");
		//wm.clickbyxpath("//button[@class=\'vh79eN\']");
		//wm.enterbyxapth(val2, name2);
			
	}
	@Test(dependsOnMethods = "search")
	public void selectproduct() throws InterruptedException {
		
		wm.clickbyxpath("//*[@id=\'container\']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img");
		wm.windowhandling();
		
	}
	@Test(dependsOnMethods = "selectproduct")
	public void addproduct() throws InterruptedException {
		wm.clickbyxpath("//button[@class =\"_2AkmmA _2Npkh4 _2MWPVK\"]");
		
	}
	
	

}
