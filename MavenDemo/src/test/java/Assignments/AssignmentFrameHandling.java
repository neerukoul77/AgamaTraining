package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.name("email")).sendKeys("koul.neeru77@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@Welcome123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		//driver.switchTo().frame(driver.findElement(By.name("downloadFrame")));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[1]")).isDisplayed());
		
		driver.findElement(By.className("item-text")).click();
		
		
		
		//driver.findElement(By.linkText("Contacts")).click();
		
		
	}

}
