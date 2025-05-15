package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
	
		
		driver.findElementByXPath("/html/body/div/div[2]/div/div/span").click(); //datepicker click
		
		driver.findElementByXPath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]").click();//month year click
		
		driver.findElementByXPath("/html/body/div[2]/div[2]/table/thead/tr/th[2]").click();//year selection clcik
		
		for(int i=12;i>1;i--)
		{
			WebElement year=driver.findElementByXPath("/html/body/div[2]/div[3]/table/tbody/tr/td/span["+i+"]");//year say 2024 sekection4
			
			
			
			if(year.equals(driver.findElementByXPath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[5]")))
			{
				year.click();
				
				
			}
			
			WebElement month = driver.findElementByXPath("/html/body/div[2]/div[2]/table/tbody/tr/td/span["+i+"]");
			
	
			if(month.equals(driver.findElementByXPath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[11]")))
				{
					month.click();
					driver.findElementByXPath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[5]").click();
					break;
					
				}

             ///////////need to learn calenadar///////////////////
		
			
	
		}
		
		
		
		//		
		
		
		
	}

}
