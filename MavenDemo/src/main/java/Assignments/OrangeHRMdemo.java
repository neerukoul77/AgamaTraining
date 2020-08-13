package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMdemo {

	public static void main(String[] args) {
		 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//for each line it will wait for 30sec if error is found and then execute
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//driver.findElement(By.xpath("//*[@id=\'txtUsername\' and @id='txtUsername']")).sendKeys("Admin");
			
			
			//xpath using contain
			driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
			
			//Startswith()
			//driver.findElement(By.xpath("//input[starts-with @id='btnLogin']")).click();
			
			//contains()
			driver.findElement(By.xpath("//span[contains(text(), 'Assign Leave')]")).click();
			
			System.out.println(driver.getTitle());
	}

}
