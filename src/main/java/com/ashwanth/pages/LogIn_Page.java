package com.ashwanth.pages;

import org.openqa.selenium.*;

public class LogIn_Page {

	private static WebElement element = null;
	 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.id("j_username"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id("j_password"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.xpath(".//*[@id='loginForm']/button"));
 
         return element;
 
         }
}
