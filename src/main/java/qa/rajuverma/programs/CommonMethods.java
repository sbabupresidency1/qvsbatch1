package qa.rajuverma.programs;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	static String strORLocatorsFileDir = "ORLocator.properties";
	static Properties prop;
	static String clickObject;

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is get Value from PropertyFile.
	 */

	public static void getPropertyFile(String strPropFileDir) {
		try {
			FileReader reader = new FileReader(strPropFileDir);
			Properties prop = new Properties();
			prop.load(reader);
			System.out.println("getPropertyFile :- " + strPropFileDir);
		} catch (FileNotFoundException e) {
			System.out.println("getPropertyFile not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("getPropertyFile Error loading properties file");
			e.printStackTrace();
		}
	}

	public static void getBrowserPropertyFile(String strBrowserFileDir, String strBrowserSyntax, String strBrowserDriverPathDir) {
		try {
			FileReader reader = new FileReader(strBrowserFileDir);
			Properties prop = new Properties();
			prop.load(reader);			
			System.out.println("Browser Properties File :- " + strBrowserFileDir);					
			System.setProperty(strBrowserSyntax, strBrowserDriverPathDir);
		} catch (FileNotFoundException e) {
			System.out.println("Browser Properties not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Browser Properties Error loading properties file");
			e.printStackTrace();
		}
	
	}
	public static void invokeURLBrowser(WebDriver driver, String strGetUrl) throws IOException, InterruptedException {
		driver.get(strGetUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public static void invokeURLBrowserWithPropertyFile(WebDriver driver, String strPropFileDir, String strGetUrl) {
		try {
			FileReader reader = new FileReader(strPropFileDir);
			Properties prop = new Properties();
			prop.load(reader);
			System.out.println("invokeURLBrowser Properties File :- " + strPropFileDir);
			driver.get(strGetUrl);
			driver.manage().window().maximize();
		} catch (FileNotFoundException e) {
			System.out.println("invokeURLBrowser No Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("invokeURLBrowser Error loading properties file");
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void setSleep(int intSleepValue) throws IOException, InterruptedException {		
		Thread.sleep(intSleepValue);
	}
	
	
	/***** Without Property File *****/

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to click the given text.
	 */

	public static void click_By_Id(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.id(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-" + clickObject);
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_xpath(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.xpath(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_className(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.className(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_cssSelector(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.cssSelector(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_name(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.name(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_linkText(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.linkText(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to send the field in respective
	 *       text box area
	 * 
	 */

	public static void setText_By_Id(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.id(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-" + clickObject);
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_xpath(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.xpath(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_className(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.className(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_cssSelector(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.cssSelector(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_name(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.name(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("setText_By_name Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_linkText(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.linkText(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod
	
	

} // EndClass
