package parkavi1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Created By: Parkavi.U
 * Created Date: 29th December '17 
 * Created Time: 4:00PM
 * Concept Used: Chrome browser launch(Webmail)
 * Task Number: 3
 */

public class BrowserlaunchTask {
	public static void main(String[] args) throws InterruptedException  {

		//To invoke firefox browser

		// System.setProperty("webdriver.gecko.driver","C:\\SeleniumBackUp\\lib\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		//To go to the below mail url and login using username and password

		// driver.get("http://mail.sensiple.com/");

		//Name locator

		//   driver.findElement(By.name("username")).sendKeys("parkavi.umapathy@sensiple.com");
		//	driver.findElement(By.name("password")).sendKeys("November17@");
		//driver.findElement(By.name("mysubmit")).click();
		//Thread.sleep(6000);

		//To close an window

		//driver.close();

		//To invoke chrome browser	

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBackUp\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//To go to the below mail url and login using username and password
		driver.manage().window().maximize();

		driver.get("http://mail.sensiple.com/");

		//Name locator

		driver.findElement(By.name("username")).sendKeys("parkavi.umapathy@sensiple.com");
		driver.findElement(By.name("password")).sendKeys("Parkavi@1234");
		driver.findElement(By.name("mysubmit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("DWT75_button3_title")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("zli__CLV-main__-1664")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("zb__NEW_MENU_title")).click();
		//driver.findElement(By.xpath("//*[@id='DWT453']")).sendKeys("parkavi.umapathy@sensiple.com");
		driver.findElement(By.id("DWT31_dropdown")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("logOff_title")).click();




	}

}


