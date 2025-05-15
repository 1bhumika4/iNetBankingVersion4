package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://mainpage.html");
        WebElement ele=driver.findElement(By.id("f1"));
        driver.switchTo().frame(ele);
        driver.findElement(By.id("t2")).sendKeys("abc");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t1")).sendKeys("pqr");
        
	}

}
