package com.ashwanth.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import com.ashwanth.pages.Guru99Login;
public class Test99GuruLogin {

	WebDriver driver;

    Guru99Login objLogin;

    
    @BeforeTest

    public void setup(){
    	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
	      WebDriver driver = new ChromeDriver();
	     
	      driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/index.php");
        

    }
    
    @Test
    public void login()
    {
    	objLogin.loginToGuru99("mgr123","mgr!23");
    }
}
    
    
