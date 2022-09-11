package com.saikumar.googlechrome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeSeacrh {
	
	@Test
	public  void search() throws IOException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ambat\\Selenium\\TestNGSimple\\src\\test\\resources\\config.properties");
		properties.load(fis);
		driver.get(properties.getProperty("URL"));
		
		Chromefactorypage chromepage = PageFactory.initElements(driver, Chromefactorypage.class);
		chromepage.searchs(properties.getProperty("Search"));
		
		
	}

}
