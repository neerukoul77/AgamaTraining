package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentBrowsers {
WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 System.out.println(browserName);
		if(browserName.equalsIgnoreCase("facebook")){
			driver.get("https://www.facebook.com/");
		}
		else if (browserName.equalsIgnoreCase("orangeHRM")){
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
	}
	@Test
	public void facebook(){
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.navigate().to("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		}
	@Test
	public void orangeHRM(){
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
	}
		
	@AfterTest
	public void tearDown() {
		//driver.close();
	}
	 
	
	
	

}



