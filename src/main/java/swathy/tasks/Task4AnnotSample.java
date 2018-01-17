package swathy.tasks;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;



/*
 * Created By: Swathy.S 
 * Created Date: 16th january '18 
 * Created Time: 10:30AM
 * Modified Date:17th january '18
 * Modified Time:2:10PM 
 * Concept Used: TestNG annotations
 * Task Number: 4
 */
public class Task4AnnotSample {

	WebDriver driver;

	@Test

	public void getTitle()
	{
		String name=driver.getTitle();
		System.out.println(name);
	}
	@BeforeClass
	public void submitButton() {
		driver.findElement(By.name("username")).sendKeys("swathy.suresh@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("SKSsuvi@1510");
		driver.findElement(By.name("mysubmit")).click();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}

	@BeforeTest
	public void urlLaunch() {
		driver.get("http://mail.sensiple.com/");
	}

	// @Test
	//public void afterTest() throws InterruptedException {
	//Thread.sleep(2000);
	//Alert alert = driver.switchTo().alert();
	//alert.dismiss();
	// driver.findElement(By.id("DWT71_button3_title")).click();
	//}

	//  }

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBackUp\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}

}
