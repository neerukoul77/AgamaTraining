package TestNG.Assignment;

import org.testng.annotations.Test;

import com.Testcases.WrapperMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CallwrapperTestng {
	WrapperMethod wm = new WrapperMethod();
  @BeforeTest
  public void beforeTest() throws IOException {
	  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	
  }

  @Test
  public void login() {
	  wm.enterbyid("txtUsername", "Admin");
	  wm.enterbyid("txtPassword", "admin123");
	  wm.clickbyxpath("//*[@id=\'btnLogin\']");
  }
  
  @Test
  public void screenshot() throws IOException {
	  wm.takesnap("src/test/resources/screenshots\\SS1.png");
  }
  @AfterTest
  public void afterTest() {
	  wm.closeapp();
	;
  }

  

}
