package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		WebElement firstHover = driver.findElementByXPath("//*[@id=\"div-hover\"]/div[1]/button");
		
		WebElement Link1 = driver.findElementByXPath("//*[@id=\"div-hover\"]/div[1]/div/a");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(firstHover).moveToElement(Link1).click().build().perform();
		
		driver.switchTo().alert().accept();
		
	
		
		
		/*
		
		Actions act = new Actions(driver);
		WebElement hoverFirst = driver.findElementByXPath("//*[@id=\"div-hover\"]/div[1]/button");
		WebElement link1 = driver.findElementByXPath("//*[@id=\"div-hover\"]/div[1]/div/a");
		
		act.moveToElement(hoverFirst).moveToElement(link1).click().build().perform();
		
		driver.switchTo().alert().accept();
		
		*/
		

	}

}
