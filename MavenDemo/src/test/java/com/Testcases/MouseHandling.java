package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement qualification = driver.findElement(By.id("menu_admin_Qualifications"));
		WebElement languages = driver.findElement(By.id("menu_admin_viewLanguages"));
		Actions action = new Actions(driver);
		//action.moveToElement(admin).click().perform();
		action.moveToElement(admin).perform();
		Thread.sleep(1000);
		action.moveToElement(qualification).perform();
		action.moveToElement(languages).click().build().perform();
		
		
 
	
		
	
		
	}

}
