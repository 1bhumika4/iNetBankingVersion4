package Sln;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class multiplelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("D://multiplelist");
	   // List <WebElement> ele=driver.findElements(By.tagName("a"));
	  //  int size=ele.size();
	    

	}

}
