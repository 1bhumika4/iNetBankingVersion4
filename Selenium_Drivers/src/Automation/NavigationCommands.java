package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.facebook.com/login.php/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
