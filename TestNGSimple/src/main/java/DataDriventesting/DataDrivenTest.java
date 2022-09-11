package DataDriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	static ChromeDriver driver;

		
		@BeforeClass
		
		public static void setup()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//return 0 ;
			
		}
		
		@Test(dataProvider="LoginData")
		public void loginTest(String user, String pwd, String exp)
		{
			driver.get("https://admin-demo.nopcommerce.com/login");
			WebElement txtEmail = driver.findElement(By.id("Email"));
			txtEmail.clear();
			txtEmail.sendKeys(user);
			
		}
		
		@DataProvider(name="LoginData")
		
		public String [][] getData()
		{
			
		}
		
		@AfterClass
		void tearDown()
		{
			driver.close();
			
		}
		
	}

	