package TestNG.Assignment;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrangeFunct {
  WebDriver driver;
  
  @BeforeMethod
  public void launchApp() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//for each line it will wait for 30sec and then execute
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
  
  @Test
	public void login() {
		
		driver.findElement(By.xpath("//*[contains(@id,'txt')]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
	}
  
  
 @Test
 public void username() {
	 	driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
		Select userRole = new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]")));
		userRole.selectByVisibleText("ESS");
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Neeru");
	 
 }
  
 @Test
 public void addemployee() {
	 driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
	 
 }
 
 
 	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

  }
