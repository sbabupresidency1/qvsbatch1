package RamyaTester;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * Created By:   R.Ramya Nagalakshmi 
 * Created Date: 29th December '17 
 * Description:  To invoke multi-browser
 */
public class Browser {
			 public static void main(String[] args) throws InterruptedException  {
				 
				//To invoke firefox browser
				 
				   System.setProperty("webdriver.gecko.driver","D:\\Selenium jar files\\geckodriver.exe");
		           WebDriver driver = new FirefoxDriver();
		         
		        //To go to the below mail url and login using username and password
		         
		            driver.get("http://mail.sensiple.com/");
		            
		        //Name locator
		            
		            driver.findElement(By.name("username")).sendKeys

		("ramyanagalakshmir@sensiple.com");
					driver.findElement(By.name("password")).sendKeys

		("November17@");
					driver.findElement(By.name("mysubmit")).click();
					Thread.sleep(6000);
				
			   //To close an window
					
					driver.close();
					
			   //To invoke chrome browser	
					
				  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chromedriver_win32\\chromedriver.exe");
			       driver = new ChromeDriver();
			    
			    //To go to the below mail url and login using username and password
			         
			         driver.get("http://mail.sensiple.com/");
			    
			    //Name locator
			             
			         driver.findElement(By.name("username")).sendKeys

		("ramyanagalakshmir@sensiple.com");
				     driver.findElement(By.name("password")).sendKeys

		("November17@");
					 driver.findElement(By.name("mysubmit")).click();
					 
					 
						
			         
			         
					
			 

	}

}
