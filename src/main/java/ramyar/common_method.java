package ramyar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 * Created By:   R.Ramya Nagalakshmi 
 * Created Date: 12/1/18
 * Description:  Common method to open URL & Browser
 */ 

public class common_method {
	static WebDriver driver;
 //Common method 
	public static WebDriver OpenApp(String BrowserName, String url) {
		fn_LaunchBrowser(BrowserName);
		fn_OpenURL(url);
      
		return driver;
	}
//To invoke URL
	public static void fn_OpenURL(String url) {
		//driver.manage().window().maximize();
		driver.get(url);
	}
	
		
	
//To launch browser
	public static WebDriver fn_LaunchBrowser(String browsername) {
		if (browsername == "CH") {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium Jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername == "FF") {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium jar files\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername == "IE") {
			System.setProperty("webdriver.ie.driver",
					"D:\\Selenium Jar files\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		return driver;
	}

}
