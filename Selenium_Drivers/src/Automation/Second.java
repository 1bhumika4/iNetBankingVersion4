package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/"https://www.facebook.com/login.php/");
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
		driver.findElement(By.name("login")).click();	
		
		
		*/
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
		driver.findElement(By.name("login")).click();
		
		String expTitle = "Log in to Facebook";
		String actTitle = driver.getTitle();
		
		if (expTitle.equals(actTitle))
		{
			System.out.println("Test case is passed");
			
			
		}
		else
			
		{
			System.out.println("test case is failed");
		}
		
		
		
		
		
		
		

	}

}
