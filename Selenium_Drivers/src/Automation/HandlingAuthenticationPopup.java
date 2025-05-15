package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@testpages.herokuapp.com/styled/auth/basic-auth-test.html");
		

	}

}
