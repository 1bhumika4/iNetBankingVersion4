package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElementByClassName("_2KpZ6l _2doB4z").click();
		//driver.findElement(By.xpath("//button[.='X']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[.='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		

	}

}
