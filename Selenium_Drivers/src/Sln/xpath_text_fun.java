package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("D://table.html");
		
		//should highlight java in the table
		driver.findElement(By.xpath("//td[text()='java']"));
		
		//should highlight java in the table		
		driver.findElement(By.xpath("//td[.='java']"));
		
		driver.findElement(By.xpath("//td[.='java' | @id='a2']")); //no o/p
		
		//dynamic elements using contains tag
		driver.findElement(By.xpath("//td[contains(text(),'java')]"));
		
		driver.findElement(By.xpath("//td[contains(.,'java')]"));
		
		//&nbsp tag
		driver.findElement(By.xpath("//span[text(),'Asia']"));
		
		
		
		

	}

}
