//pick a date for travel and take screenshot

package com.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[4]")).click();
		
		Thread.sleep(1000);
		
		// Takes screen shot
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(("src/test/resources/redbus.png")));
	    
	    driver.close();
		
	}

}
