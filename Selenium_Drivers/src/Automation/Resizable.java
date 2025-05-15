package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElementByXPath("//*[@id=\'resizable\']/div[3]");
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).dragAndDropBy(ele, 100, 100).build().perform();
		
		//act.moveToElement(ele, 100, 150).build().perform();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();

	}

}

