package qa.rajuverma.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {
	private static WebDriver driver = null;

	

	@BeforeClass
	public void startUpBrowser() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\workspace\\qvsbatch1\\SelDrivers\\geckodriver-v0.18.1-win64.exe");
		driver = new FirefoxDriver();
		driver.get("https://czimail.logix.in");
		driver.manage().window().maximize();

	}

	@Test
	public void sensipleLogin() throws InterruptedException, IOException {

		Properties prop = null;
		prop = new Properties();
		String strFilePathDir = "C:\\workspace\\SeleniumWebDriverMavenWorkOut\\FilePathDirectories.properties";
		String strORLocatorsFileDir = "C:\\workspace\\SeleniumWebDriverMavenWorkOut\\ORLocator.properties";
		try {
			prop.load(new FileInputStream(strFilePathDir));
			System.out.println("FilePathDirectories Properties File :- " + strFilePathDir);
		} catch (FileNotFoundException e) {
			System.out.println("No Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}

		try {
			prop.load(new FileInputStream(strORLocatorsFileDir));
			System.out.println("OR Properties File :- " + strORLocatorsFileDir);
		} catch (FileNotFoundException e) {
			System.out.println("No OR Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file - OR");
			e.printStackTrace();
		}

		String getUserNameValue = prop.getProperty("getUserName").trim();
		System.out.println("UserNameValue :: " + prop.getProperty("getUserName").trim());
		String getPasswordValue = prop.getProperty("getPassword").trim();
		System.out.println("PasswordValue :: " + prop.getProperty("getPassword").trim());

		/************** Getting all objects from ORLocator.properties **************/
		String getUserNameObjectLocator = prop.getProperty("Username_Objectfield").trim();
		System.out.println("getUserNameObjectLocator :: " + getUserNameObjectLocator);
		String getPasswordNameObjectLocator = prop.getProperty("Password_ObjectField").trim();
		System.out.println("getPasswordNameObjectLocator :: " + getPasswordNameObjectLocator);

		CommonMethods.setText_By_xpath(driver, getUserNameObjectLocator, getUserNameValue);
		CommonMethods.setText_By_xpath(driver, getPasswordNameObjectLocator, getPasswordValue);
		CommonMethods.setSleep(3000);
		String strTS = "SensipleMailLogin";
		CommonMethods.getScreenshot(driver, strTS);

	}	

	@AfterClass
	public void closebrowser() {
		System.out.print("\nBrowser close");
		driver.close();
	}
}