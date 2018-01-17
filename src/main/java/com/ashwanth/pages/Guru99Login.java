package com.ashwanth.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Guru99Login {

	 WebDriver driver;

	    By user99GuruName = By.name("uid");

	    By password99Guru = By.name("password");

	    By login = By.name("btnLogin");

	    

	    public Guru99Login(WebDriver driver){

	        this.driver = driver;
}
	    
	  //Set user name in text box

	    public void setUserName(String strUserName){

	        driver.findElement(user99GuruName).sendKeys(strUserName);

	    }
	    
	    //Set password in password text box

	    public void setPassword(String strPassword){

	         driver.findElement(password99Guru).sendKeys(strPassword);

	    }
	    
	    //Click on login button

	    public void clickLogin(){

	            driver.findElement(login).click();

	    }

	    

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */

	    public void loginToGuru99(String strUserName,String strPassword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPassword);

	        //Click Login button

	        this.clickLogin();        

	        

	    }

	}