//Navigating Drop Down menu
package com.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
			
			driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
			Select userRole = new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]")));
			userRole.selectByVisibleText("ESS");
			driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Neeru");
			
			Thread.sleep(1000);
			
			Select status = new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]")));
			//status.selectByIndex(2);
			//status.selectByValue("selected");
			status.selectByValue("1");
			
			
			Thread.sleep(1000);

			System.out.println(driver.getTitle());
			//driver.close();
			driver.quit();
	}

}
