package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C://Users//Bhumika//eclipse-workspace//Selenium_Drivers//WebDriver//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.name("email")).sendKeys("mercury");
		driver.findElement(By.name("pass")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		
		/*
		String exptitle="Find a flight:Mercury Tours";
		
		String acttlitle = driver.getTitle();
		
		if(exptitle.equals(acttlitle))
		{
			System.out.println("Test is passed");
		}
		
		else
		{
			System.out.println("Test is failed");
		}
		*/
		driver.close();
		
		

	}

}




