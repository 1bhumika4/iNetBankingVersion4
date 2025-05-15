package Sln;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG5 {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void Before()
	{
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod
	public void After() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
