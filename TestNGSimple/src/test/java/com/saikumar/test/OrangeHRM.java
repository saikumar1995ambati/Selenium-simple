package com.saikumar.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();
		action.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.id("btnAdd")).click();
		Select select = new Select(driver.findElement(By.id("systemUser_userType")));
		select.selectByVisibleText("Admin");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Orange Test");
		driver.findElement(By.id("systemUser_userName")).sendKeys("testuser4");
         Select select1 = new Select(driver.findElement(By.id("systemUser_status")));
         select1.selectByVisibleText("Enabled");
         driver.findElement(By.id("systemUser_password")).sendKeys("Testuser1234@");
         driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Testuser1234@");
         driver.findElement(By.id("btnSave")).click();
    
        
         
     		
		

	}

}
