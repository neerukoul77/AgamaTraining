package com.Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperMethod {
	WebDriver driver;
	
		public void insertapp(String url)
		{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
			}
		
	public void enterbyid(String val,String name)
	{
	driver.findElement(By.id(val)).sendKeys(name);
		}
		
		public void enterbyxapth(String val2, String name2)
		{
			driver.findElement(By.xpath(val2)).sendKeys(name2);

		}
		
			
		public void clickbyxpath(String val1) {
			driver.findElement(By.xpath(val1)).click();
		}
		
		public void closeapp() {
			driver.close();
		}
		
		public void takesnap(String path) throws IOException {
				TakesScreenshot ts =(TakesScreenshot)driver;
		       File source = ts.getScreenshotAs(OutputType.FILE);
		       FileUtils.copyFile(source,new File((path)));
		}
		
		
		public void selectdropdown(String text) {
		    Select month=new Select(driver.findElement(By.id("month")));
		    month.selectByVisibleText(text);
		}
		public void enterbyname(String val3, String name3) {
			driver.findElement(By.name(val3)).sendKeys(name3);
		}
		public void enterkeyusingxpath(String val4) {
			driver.findElement(By.xpath(val4)).sendKeys(Keys.ENTER);
			
		}
		public void windowhandling() throws InterruptedException {
	        Set<String>winhandles=driver.getWindowHandles();//all the windows
			System.out.println("the number of window are:"+winhandles.size());
			for(String winhandle:winhandles) {
				           driver.switchTo().window(winhandle);
				     		
				}
			String title=driver.getTitle();
			System.out.println("the page title is"+ title);
			
		}
		
	}

			
		