package swathy.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Weblaunch {

	/*
	 * Created By: Swathy.S Created Date: 29th December '17 Created Time: 4:00PM
	 * Modified Date:3rd January '18 Modified Time: 1:48 PM Concept Used: Chrome
	 * browser launch(Webmail) Task Number: 3
	 */

	public static void main(String[] args) throws InterruptedException {

		/*
		 * To invoke firefox browser
		 * 
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\SeleniumBackUp\\lib\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 * 
		 * To go to the below mail url and login using username and password
		 * 
		 * driver.get("http://mail.sensiple.com/");
		 * 
		 * Name locator
		 * 
		 * driver.findElement(By.name("username")).sendKeys(
		 * "swathy.suresh`@sensiple.com");
		 * driver.findElement(By.name("password")).sendKeys("SKSsuvi@1510");
		 * driver.findElement(By.name("mysubmit")).click(); Thread.sleep(6000);
		 * 
		 * To close an window
		 * 
		 * driver.close();
		 */

		// To invoke chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBackUp\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To go to the below mail url and login using username and password
		driver.manage().window().maximize();

		driver.get("http://mail.sensiple.com/");

		// Name locator

		driver.findElement(By.name("username")).sendKeys("swathy.suresh@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("SKSsuvi@1510");
		driver.findElement(By.name("mysubmit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("DWT75_button3_title")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("zli__CLV-main__-1664")).click();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.id("zb__NEW_MENU_title")).click(); /
		 * driver.findElement(By.xpath("//*[@id='DWT453']")).sendKeys(
		 * "swathy.suresh@sensiple.com");
		 */
		driver.findElement(By.id("DWT31_dropdown")).click();
		driver.findElement(By.id("logOff_title")).click();

	}

}
