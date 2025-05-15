package Automation;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		
		driver.findElementById("datepicker").click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		
		driver.findElementById("datepicker").click();
		
		Set<String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		
		

		
	}

}
