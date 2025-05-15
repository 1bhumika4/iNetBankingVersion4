package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/Excel%20files/Table.html");
		
		int row = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();

		int col = driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		
		System.out.println("Number of rows:"+row);
		
		System.out.println("Number of columns:"+col);
		
		for(int i=2;i<=row;i++)
		{
			for(int j=1; j<=col;j++)
			{
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
			

	}

}
