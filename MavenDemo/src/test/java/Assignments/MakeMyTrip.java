package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
	
	WebElement fromcity = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
	fromcity.sendKeys("P");
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
	//action.sendKeys(Keys.TAB).perform();
	
	
	WebElement tocity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/p/span"));
	tocity.sendKeys("Mumbai");
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();


		

		
	}

}
