package TestNG.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserOrange {
WebDriver driver;
	
@BeforeTest
@Parameters("browserName")
		public void setup(String browserName) {
	
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
	
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}
	
@Test
	public void orangehrm() throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
	Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	}

}
