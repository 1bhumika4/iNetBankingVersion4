package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://webelement_functions.html");
		driver.findElement(By.xpath("//input[@value='abc']")).clear();
		

	}

}
