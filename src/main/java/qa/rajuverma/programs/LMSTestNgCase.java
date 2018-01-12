package qa.rajuverma.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class LMSTestNgCase {
	private static WebDriver driver = null;

	@BeforeClass
	public void startUpBrowser() throws IOException, InterruptedException {
		try {
			WriteToNotepad delExistingFile = new WriteToNotepad();
			delExistingFile.deleteLogFiles();
			Properties prop = new Properties();
			prop.load(new FileReader(FileDirectories.ALLCONFIGURATION_PROP_DIRECTORIES));
			System.out.println(
					"FilePathDirectories Properties File :- " + FileDirectories.ALLCONFIGURATION_PROP_DIRECTORIES);
			String strBrowserValue = prop.getProperty("browser").trim();
			System.out.println("strBrowserValue :- " + strBrowserValue);
			if (strBrowserValue.equalsIgnoreCase("firefox")) {
				System.setProperty(FileDirectories.WEBDRIVER_FIREFOX_GECKO_SYNTAX,
						FileDirectories.FIREFOX_DRIVER_DIRECTORIES);
				driver = new FirefoxDriver();
				System.out.println("Broswer started up successfully for :- " + strBrowserValue);
				String writeBrowserValue = "Broswer started up successfully for " + strBrowserValue;
				WriteToNotepad.writeAllLines(writeBrowserValue);
			} else if (strBrowserValue.equalsIgnoreCase("chrome")) {
				System.setProperty(FileDirectories.WEBDRIVER_CHROME_SYNTAX, FileDirectories.CHROME_DRIVER_DIRECTORIES);
				driver = new ChromeDriver();
				System.out.println("strBrowserValue started up successfully for :- " + strBrowserValue);
				String writeBrowserValue = "strBrowserValue started up successfully for :- " + strBrowserValue;
				WriteToNotepad.writeAllLines(writeBrowserValue);

			}

			String strGetURL_Link = prop.getProperty("getURL").trim();
			CommonMethods.invokeURLBrowser(driver, strGetURL_Link);
			CommonMethods.maximizeWindow(driver);

		} catch (FileNotFoundException e) {
			System.out.println("No Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}

	}

	@Test
	public void sensipleLogin() throws InterruptedException, IOException {
		ExtentReports extent = ExtentReports.get(LMSTestNgCase.class);
		extent.init(FileDirectories.SENSIPLE_HTML_REPORTS_DIRECTORIES, true);
		Properties prop = null;
		prop = new Properties();
		extent.startTest("Sensiple Scenario 1 - Login Button");
		try {
			prop.load(new FileReader(FileDirectories.FILEPATH_PROP_DIRECTORIES));
			System.out.println("FilePathDirectories Properties File :- " + FileDirectories.FILEPATH_PROP_DIRECTORIES);
		} catch (FileNotFoundException e) {
			System.out.println("No Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}

		try {
			prop.load(new FileReader(FileDirectories.ORLOCATORS_PROP_DIRECTORIES));
			System.out.println("OR Properties File :- " + FileDirectories.ORLOCATORS_PROP_DIRECTORIES);
		} catch (FileNotFoundException e) {
			System.out.println("No OR Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file - OR");
			e.printStackTrace();
		}
		/**************
		 * Getting all input datas from FilePathDirectories.properties
		 **************/
		String getUserNameValue = prop.getProperty("getUserName").trim();
		System.out.println("UserNameValue :: " + prop.getProperty("getUserName").trim());
		String getPasswordValue = prop.getProperty("getPassword").trim();
		System.out.println("PasswordValue :: " + prop.getProperty("getPassword").trim());
		String getLeaveTypeDropdownValue = prop.getProperty("getLeaveType").trim();
		System.out.println("getLeaveTypeDropdownValue :: " + prop.getProperty("getLeaveType").trim());

		/************** Getting all objects from ORLocator.properties **************/
		String userNameOR = prop.getProperty("Username_xpath").trim();
		System.out.println("getUserNameObjectLocator :: " + userNameOR);
		String passwordOR = prop.getProperty("Password_xpath").trim();
		System.out.println("getPasswordNameObjectLocator :: " + passwordOR);

		String signButtonOR = prop.getProperty("SignButton_xpath").trim();
		System.out.println("signButtonOR :: " + signButtonOR);
		String createRequestOR = prop.getProperty("CreateRequest_xpath").trim();
		System.out.println("createRequestOR :: " + createRequestOR);

		String LeaveRequest_xpath = prop.getProperty("LeaveRequest_xpath").trim();
		System.out.println("LeaveRequest_xpath :: " + LeaveRequest_xpath);
		String LeaveTypeDropdown_xpath = prop.getProperty("LeaveTypeDropdown_xpath").trim();
		System.out.println("LeaveTypeDropdown_xpath :: " + LeaveTypeDropdown_xpath);

		if (userNameOR != null) {
			if (getUserNameValue != null) {
				CommonMethods.clear_By_xpath(driver, userNameOR);
				CommonMethods.setText_By_xpath(driver, userNameOR, getUserNameValue);
				extent.log(LogStatus.INFO, "Username value is Logged Successfully");
				extent.log(LogStatus.PASS, "Username value is Logged Successfully");
				String printLogValue = "Username Value " + getUserNameValue + " is entered successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			} else {
				extent.log(LogStatus.ERROR, "UserName value is not Logged Successfully");
				extent.log(LogStatus.FAIL, "UserName value is not Logged Successfully");
				String printLogValue = "Username Value " + getUserNameValue + "is not entered successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			}
		} else {
			extent.log(LogStatus.ERROR, "UserName object is not found");
			extent.log(LogStatus.FAIL, "UserName object is not found");
			String printLogValue = "Username Object " + userNameOR + "is not found";
			WriteToNotepad.writeAllLines(printLogValue);
		}

		if (passwordOR != null) {
			if (getPasswordValue != null) {
				CommonMethods.setText_By_xpath(driver, passwordOR, getPasswordValue);
				extent.log(LogStatus.INFO, "Password value is Logged Successfully");
				extent.log(LogStatus.PASS, "Password value is Logged Successfully");
				String printLogValue = "Password Value " + getUserNameValue + " is entered successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			} else {
				extent.log(LogStatus.ERROR, "Password value is not Logged Successfully");
				extent.log(LogStatus.FAIL, "Password value is not Logged Successfully");
				String printLogValue = "Password Value " + getPasswordValue + " is not entered successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			}
		} else {
			extent.log(LogStatus.ERROR, "Password object is not found");
			extent.log(LogStatus.FAIL, "Password object is not found");
			String printLogValue = "Password object " + passwordOR + " is not entered successfully";
			WriteToNotepad.writeAllLines(printLogValue);
		}

		if (signButtonOR != null) {
			CommonMethods.click_By_xpath(driver, signButtonOR);
			extent.log(LogStatus.INFO, "Sign Button is clicked successfully");
			extent.log(LogStatus.PASS, "Sign Button is clicked successfully");
			String printLogValue = "Sign Button is clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);

		} else {
			extent.log(LogStatus.ERROR, "Sign Button is not clicked successfully");
			extent.log(LogStatus.FAIL, "Sign Button is not clicked successfully");
			String printLogValue = "Sign Button is not clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);
		}

		CommonMethods.setSleep(3000);

		extent.startTest("Sensiple Scenario 2 - Leave Request");
		
		if (createRequestOR != null) {
			CommonMethods.click_By_xpath(driver, createRequestOR);
			extent.log(LogStatus.INFO, "Create Request is clicked successfully");
			extent.log(LogStatus.PASS, "Create Request is clicked successfully");
			String printLogValue = "Create Request is clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);

		} else {
			extent.log(LogStatus.ERROR, "Create Request is not clicked successfully");
			extent.log(LogStatus.FAIL, "Create Request is not clicked successfully");
			String printLogValue = "Create Request is not clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);
		}

		if (LeaveRequest_xpath != null) {
			CommonMethods.click_By_xpath(driver, LeaveRequest_xpath);
			extent.log(LogStatus.INFO, "Leave Request is clicked successfully");
			extent.log(LogStatus.PASS, "Leave Request is clicked successfully");
			String printLogValue = "Leave Request is clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);

		} else {
			extent.log(LogStatus.ERROR, "Leave Request is not clicked successfully");
			extent.log(LogStatus.FAIL, "Leave Request is not clicked successfully");
			String printLogValue = "Leave Request is not clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);
		}

		if (LeaveTypeDropdown_xpath != null) {
			CommonMethods.selectByVisibleText_By_xpath(driver, LeaveTypeDropdown_xpath, getLeaveTypeDropdownValue);
			if (LeaveTypeDropdown_xpath == getLeaveTypeDropdownValue) {
				extent.log(LogStatus.INFO,
						"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is selected successfully");
				extent.log(LogStatus.PASS,
						"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is selected successfully");
				String printLogValue = "Leave Type Dropdown value " + getLeaveTypeDropdownValue
						+ " is selected successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			} else {
				extent.log(LogStatus.INFO,
						"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is not selected successfully");
				extent.log(LogStatus.PASS,
						"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is not selected successfully");
				String printLogValue = "Leave Type Dropdown value " + getLeaveTypeDropdownValue
						+ " is selected successfully";
				WriteToNotepad.writeAllLines(printLogValue);
			}

		} else {
			extent.log(LogStatus.ERROR, "Leave Request is not clicked successfully");
			extent.log(LogStatus.FAIL, "Leave Request is not clicked successfully");
			String printLogValue = "Leave Request is not clicked successfully";
			WriteToNotepad.writeAllLines(printLogValue);
		}

	}// End Method for sensipleLogin()

	@AfterClass
	public void closebrowser() {
		System.out.print("\nBrowser close");
		driver.close();
	}
}