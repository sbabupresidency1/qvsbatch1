package ashwanth.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class chromebrowserlaunch {
	 public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
	      WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://prince2.sensiple.com/prince-web/ems/login/view");//Launch Chrome Browser
		 
		 driver.manage().window().maximize();//Maximize the window
		 
		 //Enter Username, Password and login
		 driver.findElement(By.id("j_username")).sendKeys("2305");
	     driver.findElement(By.id("j_password")).sendKeys("achu7148");
		 driver.findElement(By.xpath(".//*[@id='loginForm']/button")).click();
		 driver.findElement(By.id("swipeDetailsId")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("get-resource-assignment")).click();
		
		 Thread.sleep(6000);
		 
		 
		 
		 driver.close();
	 }
}