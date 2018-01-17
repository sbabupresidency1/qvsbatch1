package com.ashwanth.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ashwanth.pages.LogIn_Page;

public class PageObjectModel {
	
	WebDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe"); //Setting up chrome driver
		 driver = new ChromeDriver();  
		 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     driver.get("http://prince2.sensiple.com/prince-web/ems/login/view");
	     
	     driver.manage().window().maximize();	 
	}
	
	@AfterSuite
	public void Login() {
		   
	     LogIn_Page.txtbx_UserName(driver).sendKeys("2305");
	 
	     LogIn_Page.txtbx_Password(driver).sendKeys("achu7148");
	 
	     LogIn_Page.btn_LogIn(driver).click();

	     System.out.println(" Login Successfull, now it is the time to Log Off.");
	 
	     driver.quit();
	 
	     }
}
