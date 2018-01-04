package ramyar;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	public WebDriver driver;

	@BeforeTest
	public void launchbrowser() {
		// Puts an Implicit wait, Will wait for 10 seconds before throwing exception

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium jar files\\geckodriver.exe");
		driver = new FirefoxDriver();

	}
	@BeforeMethod
	public void launchapp() {
		driver.navigate().to("http://mail.sensiple.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {

		driver.findElement(By.name("username")).sendKeys("ramyanagalakshmir@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("November17@");
		driver.findElement(By.name("mysubmit")).click();
	}

	// Launch website
	
	@AfterTest
	public void terminatetest() {
		driver.close();
	}
}
