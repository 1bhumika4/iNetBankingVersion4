package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("D://second.html");
		Thread.sleep(4000);
		driver.findElement(By.id("a2")).sendKeys("bhumika");
		driver.findElement(By.id("a2")).clear();
	}

}
