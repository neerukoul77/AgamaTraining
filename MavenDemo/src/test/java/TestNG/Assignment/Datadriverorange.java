package TestNG.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriverorange {
WebDriver driver;
	
	@Test(dataProvider="orangehrmlogin")
	public void loginToOrangeHRM(String username,String password) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();       
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	//driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	Thread.sleep(5000);
	
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	@DataProvider(name="orangehrmlogin")
	public Object[][] passData() throws InterruptedException {

	Object[][] data=new Object[5][2];
	 		//username
			data[0][0]="Admin";
			//password
			data[0][1]="admin123";

			data[1][0]="Admin1";
			data[1][1]="admin123";

			data[2][0]="Admin";
			data[2][1]="admin";
			
			data[3][0]="Admin123";
			data[3][1]="admin";
			
			data[4][0]="";
			data[4][1]="";

			

			return data;
		}


}
