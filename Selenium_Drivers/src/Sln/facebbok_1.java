package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebbok_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");		
		//FirefoxDriver driver= new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8904907746");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("siddappajihowdu");
driver.findElement(By.xpath("//button[@name='login']")).click();

	}
}
