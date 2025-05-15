package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		//System.setProperty("webdriver.driver.chrome", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/popuptest2.html");
		//driver.close(); // closes only single window
		
		driver.quit(); //closes multiple windows

	}

}
