package com.ashwanth.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.ashwanth.pages.Home_Page;

import com.ashwanth.pages.LogIn_Page;

public class PageObjectModel {

	private static WebDriver driver = null;
	
	@BeforeSuite
	   public void DriverLaunch() {
	 
		   System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
		   
		   WebDriver driver = new ChromeDriver();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("http://www.store.demoqa.com");
	     
	     driver.manage().window().maximize();
	     
	     Home_Page.lnk_MyAccount(driver).click();
	   }
	   
	@Test
	   public void Login() {
		  
		   
	     LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");
	 
	     LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
	 
	     LogIn_Page.btn_LogIn(driver).click();
	   }
	  
	   @AfterSuite
	   public void Logout() {
	 
	     System.out.println(" Login Successfull, now it is the time to Log Off.");
	 
	     Home_Page.lnk_LogOut(driver).click();
	 
	     driver.quit();
	 
	     }
}
