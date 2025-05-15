package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/context-menu");
		
		WebElement button = driver.findElementById("hot-spot");
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).build().perform();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		/*
		
		WebElement button = driver.findElementById("hot-spot");
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).build().perform();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		*/

	}

}
