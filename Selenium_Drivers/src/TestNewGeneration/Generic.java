package TestNewGeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	
	public WebDriver driver;
	
	/*
	 * @BeforeMethod public void OpenAppln() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe"
	 * ); driver = new ChromeDriver();
	 * driver.get("https://www.facebook.com/login.php/"); }
	 * 
	 */
	/*
	 * @AfterMethod public void CloseAppln() throws InterruptedException {
	 * Thread.sleep(3000); driver.quit();
	 * 
	 * }
	 */
	
	
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	}
	
	
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	 
}