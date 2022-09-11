package com.saikumar.googlechrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chromefactorypage {
	WebDriver driver;
	@FindBy(how = How.NAME,using="q")
	WebElement search;
	
	public void Chromefactorypage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void searchs(String sear)
	{
		search.sendKeys(sear);
	}

}
