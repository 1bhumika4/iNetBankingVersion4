package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.marionette", "./WebDriver/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");

	}

}
