package com.orangehrm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeloginTest {
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   LoginPage login = new LoginPage(driver);
	   login.logintoOrange("Admin", "admin123");
	   driver.quit();
	}

}
