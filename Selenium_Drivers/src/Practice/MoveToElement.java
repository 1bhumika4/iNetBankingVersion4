package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.xpath("//button[.='X']")).click();
		 
		
		  WebElement ele= driver.findElementByXPath("//div[.='Fashion']");
		  Actions a=new Actions(driver);
		  a.moveToElement(ele).perform();
		
		  
		  
	}

}
