package parkavi1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;

public class Trial1 {
	
	static WebDriver driver;
	public static void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBackUp\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void  ieLaunch()
	{
		
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumBackUp\\lib\\IEDriverServer.exe");	
		driver = new InternetExplorerDriver();
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String appURL)
	{
		//driver.get(url);
		driver.navigate().to(appURL);
		driver.close();
	}
	
	/*public static void login()
	{
		driver.findElement(By.id("j_username")).sendKeys("parkavi.umapathy@sensiple.com");
		driver.findElement(By.id("j_password")).sendKeys("Parkavi@1234");
        driver .findElement(By.className("btn btn-lg btn-primary btn-block")).click();
	}*/

	


	



}
