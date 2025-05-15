package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG5 {
	
	public ChromeDriver driver;
	
	@BeforeTest
	public void open_appln()
	{
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	
	@AfterTest
	public void close_appln() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
