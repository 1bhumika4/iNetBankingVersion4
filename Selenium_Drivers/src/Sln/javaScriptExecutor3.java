package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.alibaba.com/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[.='Resources']"));
		Point p=ele.getLocation();
		System.out.println(p);
		int x=p.getX();
		System.out.println(x);
		int y = p.getY();
		System.out.println(y);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		ele.click();
		

	}

}
