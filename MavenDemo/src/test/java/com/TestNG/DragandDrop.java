package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	WebDriver driver;
@Test
	public void actionOn() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement drag = driver.findElement(By.xpath("//*[@id=\'draggable\']"));
	
	Thread.sleep(6000);
	//System.out.println(drag.getText());
	WebElement drop = driver.findElement(By.xpath("//*[@id=\'droppable\']"));
	
	Actions action = new Actions(driver);
	Thread.sleep(6000);
	action.dragAndDrop(drag, drop).build().perform();
	
}
	
	
}
