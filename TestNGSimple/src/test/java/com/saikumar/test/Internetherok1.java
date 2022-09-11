package com.saikumar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Internetherok1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		Select select = new Select(driver.findElement(By.id("dropdown")));
		select.selectByVisibleText("Option 2");
		WebElement option = select.getFirstSelectedOption();
    	 Assert.assertEquals("Option 2",option.getText());
		

	}

}
