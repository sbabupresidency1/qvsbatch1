package ashwanth.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrowserlaunch {
	 public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.ie.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\IEDriverServer.exe");	
			WebDriver driver = new InternetExplorerDriver();
		 
		 driver.get("http://prince2.sensiple.com/prince-web/ems/login/view");//Launch Chrome Browser
		 
		 driver.manage().window().maximize();//Maximize the window
		 
		 Thread.sleep(6000);
		 
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