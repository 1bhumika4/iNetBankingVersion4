package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("D:\\checkbox.html");
		
		//should highlight all the webelements//
		//driver.findElement(By.xpath("//*"));
		//driver.findElement(By.cssSelector("*"));
		
		//should highlight the checkboxes//
		//driver.findElement(By.xpath("//input[@type='checkbox']"));
		

	}

}
