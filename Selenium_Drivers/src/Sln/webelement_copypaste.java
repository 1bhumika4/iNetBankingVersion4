package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_copypaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://webelement_copypaste.html");
		WebElement ele= driver.findElement(By.xpath("//input[@value='abc']"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		WebElement ele1=driver.findElement(By.xpath("//input[@value='xyz']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"v");
		

	}

}
