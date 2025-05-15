package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_isenabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://webelement_isenabled.html");
	  WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
	  if(ele.isEnabled())
System.out.println("enabled");
	  else
		  System.out.println("disabled");
	}

}
