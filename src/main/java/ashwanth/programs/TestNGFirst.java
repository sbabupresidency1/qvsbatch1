package ashwanth.programs;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGFirst {
	
	
	WebDriver driver;
	
   // test case 1
   @Test
   public void testCase1() {
	   driver.findElement(By.xpath(".//*[@id='loginForm']/button")).click();
   }

   
   @BeforeMethod
   public void beforeMethod() {
	   driver.findElement(By.id("j_username")).sendKeys("2305");
	     driver.findElement(By.id("j_password")).sendKeys("achu7148");
   }

   @AfterMethod
   public void afterMethod() {
	   driver.findElement(By.id("swipeDetailsId")).click();
   }

   @BeforeClass
   public void beforeClass() {
	   driver.manage().window().maximize();
   }

   @AfterClass
   public void afterClass() throws InterruptedException {
	   Thread.sleep(3000);
		 driver.findElement(By.id("get-resource-assignment")).click();
   }

   @BeforeTest
   public void beforeTest() {
	driver.get("http://prince2.sensiple.com/prince-web/ems/login/view");
   }

   @AfterTest
   public void afterTest()throws InterruptedException {
	   Thread.sleep(6000);
   }

   @BeforeSuite
   public void beforeSuite() {
	   System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\ChromeDriver.exe"); //Setting up chrome driver
	       driver = new ChromeDriver();
   }

   @AfterSuite
   public void afterSuite() {
	   driver.close();
   }

}