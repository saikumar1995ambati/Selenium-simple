package com.saikumar.practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium");
		driver.manage().window().maximize();
		int s = driver.findElements(By.xpath("//ul[@id='menu-products']//li")).size();
		System.out.println(s);
		List<WebElement>list = driver.findElements(By.xpath("//ul[@id='menu-products']//li"));
		for(WebElement name : list)
		{
			System.out.println(name.getText());
		}
		WebElement footer = driver.findElement(By.xpath("//ul[@id='menu-products']"));
		String parentwindow = driver.getWindowHandle();
		
		   int footersize = footer.findElements(By.tagName("a")).size();
		   System.out.println(footersize);
		   
		   for(int i=1;i<footersize;i++)
		   {
			
			 String opentab=  Keys.chord(Keys.CONTROL,Keys.ENTER);
			 footer.findElements(By.tagName("a")).get(i).sendKeys(opentab);
		   }
		Set<String>whandles = driver.getWindowHandles();
		Iterator<String>s1 = whandles.iterator();
		while(s1.hasNext())
		{
			System.out.println(driver.getCurrentUrl());
		}
 		
	}

}
