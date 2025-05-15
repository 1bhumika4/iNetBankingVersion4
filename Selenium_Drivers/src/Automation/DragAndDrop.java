package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement source = driver.findElementById("box1");
		
		WebElement destination = driver.findElementById("box103");
		
		Actions act = new Actions(driver);
		
		//act.dragAndDrop(source, destination).build().perform();
		
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		
		
		
		
		
		/*
		
		WebElement source = driver.findElementById("box1");
		
		WebElement destination = driver.findElementById("box103");
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		//act.dragAndDrop(source, destination).build().perform();
		 * 
		 * */
		

	}

}
