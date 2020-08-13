package com.Testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws IOException {
		//System.setProperty("Webdriver.chrome.driver", "C:\\Neeru\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//for each line it will wait for 30sec and then execute
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.google.com/");//navigate.to(url address/name)
		//driver.navigate().back();
		//driver.navigate().forward();
		TakesScreenshot ts =(TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(source,new File(("src/test/resources/screenshots/screenimages.png")));

		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

}
