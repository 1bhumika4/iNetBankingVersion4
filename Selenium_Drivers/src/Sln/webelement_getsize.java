package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D://webelement_functions.html");
		WebElement ele= driver.findElement(By.xpath("//input[@value='abc']"));
		Dimension size=ele.getSize();
		System.out.println(size);
		int h=size.getHeight();
		int w=size.getWidth();
		System.out.println(h);
		System.out.println(w);
	

	}

}
