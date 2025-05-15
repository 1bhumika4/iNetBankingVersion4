package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		

	}

}
