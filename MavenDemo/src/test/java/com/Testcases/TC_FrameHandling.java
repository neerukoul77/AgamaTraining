package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Inspect the text inside frame and find xpath and print that out
		System.out.println(driver.findElement(By.xpath("//*[@id=\'draggable\']/p")).isDisplayed());
		//to come out of frame
		driver.switchTo().defaultContent();
		
		// inspect droppable link on the web page
		
		driver.findElement(By.linkText("Droppable")).click();
		
	}

}
