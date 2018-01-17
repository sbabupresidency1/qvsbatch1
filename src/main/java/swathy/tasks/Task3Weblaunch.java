package swathy.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Weblaunch {

	/*
	 * Created By: Swathy.S 
	 * Created Date: 29th December '17 
	 * Created Time: 4:00PM
	 * Modified Date:16th January '18 
	 * Modified Time: 2:48 PM 
	 * Concept Used: Chrome
	 * browser launch(Webmail) 
	 * Task Number: 3
	 */

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBackUp\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//To go to the below mail url and login using username and password
		driver.manage().window().maximize();

		driver.get("http://mail.sensiple.com/");

		//Name locator

		driver.findElement(By.name("username")).sendKeys("swathy.suresh@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("SKSsuvi@1510");
		Thread.sleep(2000);
		driver.findElement(By.name("client")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("client")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("mysubmit")).click();
		driver.close();
	



	}

}
