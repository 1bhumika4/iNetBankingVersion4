package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemt_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://webelement_functions.html");
		WebElement ele= driver.findElement(By.xpath("//input[@value='abc']"));
		boolean b = ele.isDisplayed();
		if(b)
			System.out.println("Displayed");
		else
			System.out.println("Not Displayed");

	
		
		
		
	}

}
