package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//ChromeOptions option = new ChromeOptions();
		//driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com");
		//driver.close();
		*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		                                                                                                             
		
		
		
		

	}

}
