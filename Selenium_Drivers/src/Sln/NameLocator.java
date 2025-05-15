package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//String key= "webdriver.chrome.driver";
				//String value = "./WebDriver/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
				//FirefoxDriver driver= new FirefoxDriver();
				ChromeDriver driver= new ChromeDriver();
				driver.get("D://first.html");
				
			//driver.findElement(By.tagName("a")).click();
				//driver.findElement(By.id("a1")).click();
				
				//driver.findElement(By.name("n1")).click();
				//driver.findElement(By.className("c1")).click();
				//driver.findElement(By.linkText("Abhishek")).click();
				//driver.findElement(By.partialLinkText("Abhi")).click();
				
				driver.findElement(By.cssSelector("a[id='a1']")).click();
				
			
				Thread.sleep(4000);
				//ele.click();
	}

}
