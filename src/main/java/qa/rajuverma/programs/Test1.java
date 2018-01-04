package qa.rajuverma.programs;

import org.testng.annotations.Test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	WebDriver driver;
	String getFirefoxDriverPathFileDirectory;
	String getFirefoxDriverSyntax;

	@SuppressWarnings("unused")
	@Test
	public void Login() throws InterruptedException, IOException

	{
		Properties prop;
		prop = new Properties();
		String strFilePathDir = "C:\\workspace\\qvsbatch1\\FilePathDirectories.properties";
		String strORLocatorsFileDir = "C:\\workspace\\qvsbatch1\\ORLocator.properties";

		/************** Property File - FilePathDirectories.properties **************/
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

		/************** Property File - ORLocator.properties **************/
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

		getFirefoxDriverPathFileDirectory = prop.getProperty("getFirefoxDriverPathFileDirectory").trim();
		getFirefoxDriverSyntax = prop.getProperty("getFirefoxDriverSyntax").trim();
		System.setProperty(getFirefoxDriverSyntax, getFirefoxDriverPathFileDirectory);

		driver = new FirefoxDriver();

		String getUrlProp;
		getUrlProp = prop.getProperty("getURL").trim();
		System.out.println("URL :: " + prop.getProperty("getURL").trim());
		
		CommonMethods.invokeURLBrowser(driver, getUrlProp);

		String getUserNameValue;
		String getPasswordValue;
		String getUserNameObjectLocator;
		String getPasswordNameObjectLocator;

		/**************
		 * Checking if filepath directories and OR directories are available or not
		 **************/
		if (strFilePathDir != null) {
			if (strORLocatorsFileDir != null) {

				/**************
				 * Getting all Values from FilePathDirectories.properties
				 **************/
				getUserNameValue = prop.getProperty("getUserName").trim();
				System.out.println("UserNameValue :: " + prop.getProperty("getUserName").trim());
				getPasswordValue = prop.getProperty("getPassword").trim();
				System.out.println("PasswordValue :: " + prop.getProperty("getPassword").trim());

				/************** Getting all objects from ORLocator.properties **************/
				getUserNameObjectLocator = prop.getProperty("Username_Objectfield").trim();
				System.out.println("getUserNameObjectLocator :: " + getUserNameObjectLocator);
				getPasswordNameObjectLocator = prop.getProperty("Password_ObjectField").trim();
				System.out.println("getPasswordNameObjectLocator :: " + getPasswordNameObjectLocator);
				
				CommonMethods.setText_By_xpath(driver, getUserNameObjectLocator, getUserNameValue);
				CommonMethods.setText_By_xpath(driver, getPasswordNameObjectLocator, getPasswordValue);
				CommonMethods.setSleep(3000);				

				driver.close();
				// driver.quit();
			} else {
				System.out.println("FilePath is not found - OR");
			}

		} else {
			System.out.println("FilePath is not found");
		}

	}

}
