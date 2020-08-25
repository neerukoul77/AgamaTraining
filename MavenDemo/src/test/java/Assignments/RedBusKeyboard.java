package Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusKeyboard {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).build().perform();
	
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("che");
		
		//Keyboard handling
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();

		//selecting calander
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[2]")).click();
		
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(("src/test/resources/redbus1.png")));
	    
	    driver.close();
		
	}

}
