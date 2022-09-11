package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void logintoOrange(String userid, String pass)
	{
	      driver.findElement(username).sendKeys(userid);
	      driver.findElement(password).sendKeys(pass);
	      driver.findElement(login).click();
	}

}
