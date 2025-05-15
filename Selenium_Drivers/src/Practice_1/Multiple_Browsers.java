package Practice_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		System.setProperty("webdriver.gecko.driver", "./WebDriver/geckodriver.exe");
		FirefoxDriver driver1= new FirefoxDriver();
		driver1.get("https://www.gmail.com");
		

	}

}
