package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElementByXPath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input").sendKeys("Admin");
		driver.findElementByXPath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input").sendKeys("admin123");
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a").click();
		
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]").click();//user managemnet click
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li").click();//users click
		
		int rowcount = driver.findElementsByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span").size();//get the number of rows from the users table
				
		System.out.println(rowcount);
		
		int statuscount = 0;
		
		for(int i=1;i<=rowcount;i++)
		{
			String status = driver.findElementByXPath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]").getText();
			
			if(status.equals("enabled"))
				
			{
				statuscount = statuscount +1;
				
			}
		}
		
		System.out.println("Number of users enabled:"+statuscount);
		driver.close();
	
	}

}
