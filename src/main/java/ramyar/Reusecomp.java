package ramyar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;



/*
 * Created By:   R.Ramya Nagalakshmi 
 * Created Date: 29th December '17 
 * Description:  Check-box concept with reusable method and fetching basic configuartions from property file
 */ 

public class Reusecomp {

	static WebDriver driver;
	// static WebDriver driver1;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ramyanagalakshmir\\Desktop\\datafile.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
			String getSSR_OR = prop.getProperty("SSR").trim();
			System.out.println("getSSR_OR :: " + getSSR_OR);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        //To invoke various browsers
		
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("Driver"));
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEDriver"));
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(5000);
		
		//Admin tab click
		
		String menuclick = "menu_admin_viewAdminModule";
		driver.findElement(By.id(menuclick)).click();
        
		//Method to check
		
		reusablecall();
		Thread.sleep(5000);
		
		//Method to uncheck
		
		reusablecall();

		// Dropdown

		//drop();
	}
	
	
	public static void reusablecall() {

		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
	}

	public static void drop() throws InterruptedException {
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/recruitment/viewCandidates");
		Thread.sleep(5000);

		WebElement selectElement = driver.findElement(By.id("candidateSearch_jobTitle"));
		// selectElement.click();
		Select dropdown = new Select(selectElement);
		List<WebElement> allOptions = dropdown.getOptions();
		System.out.println(allOptions);
		for (int j = 0; j < allOptions.size(); j++) {
			System.out.println(allOptions.get(j).getText());
		}

	}

	
	
	
	
	
	
	
}
