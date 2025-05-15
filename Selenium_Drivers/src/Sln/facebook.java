package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8904907746");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("siddappajihowdu");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		


	}

}
