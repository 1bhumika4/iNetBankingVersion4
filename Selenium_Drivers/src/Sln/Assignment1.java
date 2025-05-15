package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("D://second.html");
		Thread.sleep(4000);
		driver.findElement(By.id("a2")).sendKeys("bhumika");
		driver.findElement(By.id("a3")).sendKeys("bhumika");
		driver.findElement(By.id("a3")).clear();
		driver.findElement(By.linkText("forgot password?")).click();

	}

}
