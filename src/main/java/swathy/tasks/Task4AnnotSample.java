package swathy.tasks;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
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
 * Modified Date:
 * Modified Time: 
 * Concept Used: TestNG annotations
 * Task Number: 4
 */
public class Task4AnnotSample {
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
=======

>>>>>>> 8cc7995a7893fa74077af9ede4a2415ac0f7b977
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

<<<<<<< HEAD
<<<<<<< HEAD
=======

	 @AfterSuite
	 public void closeBrowser()
	 {
	    driver.close();
	 }


>>>>>>> 8cc7995a7893fa74077af9ede4a2415ac0f7b977
	// @AfterSuite
	// public void closeBrowser() {
	//    driver.close();
	// }
=======
	 @AfterSuite
	 public void closeBrowser() {
	    driver.close();
	 }
>>>>>>> 4bc3f7c83497116094b5a9b173dbedbbe675a752
>>>>>>> b5a5c8df3299167c602d55e4f7239f00941ebde5


}
