package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		/*
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElementByXPath("//*[@id=\"slider\"]/span");
		
		Actions act =new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		
		
*/
		driver.switchTo().frame(0);
		WebElement slider = driver.findElementByXPath("//*[@id=\"slider\"]/span");
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider, 300, 0).build().perform();
	}

}
