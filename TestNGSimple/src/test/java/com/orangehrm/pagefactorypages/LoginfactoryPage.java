package com.orangehrm.pagefactorypages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginfactoryPage {

	WebDriverWait wait;
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.TAG_NAME, using = "button")
	WebElement submit;

	public LoginfactoryPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	

	public void loginfunction(String uname, String pass) {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();

	}
}
