//Navigate menu and going to next page

package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateNextPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
		
		Thread.sleep(1000);

		//contains()
		driver.findElement(By.xpath("//span[contains(text(), 'Assign Leave')]")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

}
