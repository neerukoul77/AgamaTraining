package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filebin.net/");
		
		driver.findElement(By.xpath("//*[@id=\"fileField\"]")).sendKeys("C:\\Users\\neeru\\OneDrive\\Desktop\\code1.txt");
		
		driver.close();
	}

}
