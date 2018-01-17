package com.ashwanth.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Guru99HomePage {

	 WebDriver driver;

	    By homePageUserName = By.className("barone");

	    

	    public Guru99HomePage(WebDriver driver){

	        this.driver = driver;

	    }

	    

	    //Get the User name from Home Page

	        public String getHomePageDashboardUserName(){

	         return    driver.findElement(homePageUserName).getText();

	        }
}
