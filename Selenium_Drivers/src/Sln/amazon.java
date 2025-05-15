package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("a[id='nav-link-accountList']")).click();
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		//driver.findElementByCssSelector("input[id='ap_email']").sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("bhumi");
		driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
		

	}

}
