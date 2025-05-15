package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		Actions builder = new Actions(driver);

		builder.moveToElement(driver.findElement(By.xpath("//input[@id='myFile']"))).click().build().perform();
		
		//driver.findElementByXPath("/html/body/div/div[2]/div/form/input[1]").submit();
		
		
		/*
		WebElement element = driver.findElement(By.id("imagesrc"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);*/
		
		//*[@id="myFile"]

	}

}
