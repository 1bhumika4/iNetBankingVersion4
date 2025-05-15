package Automation;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingWIndows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		
	/*	driver.findElementById("datepicker").click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
			String t = driver.switchTo().window(i).getTitle();
			
			
			if(t.contains("WebDriver | Datepicker"))
			{
				driver.close();
			}
			
			
		}*/
		
		driver.findElementById("datepicker").click();
		
		Set<String> s = driver.getWindowHandles();
		
		
		for(String i:s)
		{
			String t = driver.switchTo().window(i).getTitle();
			
			if(t.contains("WebDriver | Datepicker"))
				
				driver.close();
		}
		
		
	
		

	}

}
