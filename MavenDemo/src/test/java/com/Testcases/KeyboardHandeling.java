package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		Actions action = new Actions(driver);
		
		// goes to different field
		// perform is for keyboard actions
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("admin123").perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).perform();
				
	}

}
