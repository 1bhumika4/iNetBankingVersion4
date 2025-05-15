package Sln;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String key= "webdriver.chrome.driver";
		//String value = "./WebDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.get("https://www.amazon.com");
		
		driver.close();
	
		

	}

}
