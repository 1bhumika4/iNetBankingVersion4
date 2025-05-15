package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("8904907746");
		driver.findElement(By.xpath("//input[@name='pass' and @type='password']")).sendKeys("siddappajihowdu");
		driver.findElement(By.xpath("//button[@type='submit' and @value='1']")).click();
		

	}

}
