// Launching Chrome Browser by calling webdrivermanager


package com.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserLaunch {

		public static void main(String[] args) throws IOException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//for each line it will wait for 30sec and then execute
			driver.get("https://www.facebook.com/");
			driver.navigate().to("https://www.google.com/");//navigate.to(url address/name)
			driver.navigate().back();
			driver.navigate().forward();
			
			System.out.println(driver.getTitle());
			//driver.close();
			driver.quit();
	}

}
