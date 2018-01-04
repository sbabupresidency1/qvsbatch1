package ramyar;

/*
 * Created By:   R.Ramya Nagalakshmi 
 * Created Date: 03/1/18
 * Description: Program with TestNG Annotations
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	public WebDriver driver;

	// Launch website
	
	@BeforeMethod
	
	public void launchapp() {
		// Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Implicit wait done");
		driver.navigate().to("http://mail.sensiple.com/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void login() {
		
		//Explicit wait
		
				WebDriverWait wait = new WebDriverWait(driver,90);
				wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
				System.out.println("Explicit wait done");
			

		driver.findElement(By.name("username")).sendKeys("ramyanagalakshmir@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("November17@");
		driver.findElement(By.name("mysubmit")).click();
	}

	@AfterMethod
	
	public void refresh1() {
		
		driver.navigate().refresh();
		System.out.println("Page refreshed succesfully");
	}

	@BeforeSuite
	public void launchbrowser() {
//Launch browser
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium jar files\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@AfterTest
	public void maximize() {
		 driver.manage().window().maximize();
		 System.out.println("Page maximized");
	}
	
	@AfterSuite
	public void terminate() {
		 driver.close();
	
}
}
