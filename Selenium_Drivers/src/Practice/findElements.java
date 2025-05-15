package Practice;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> ele=driver.findElementsByTagName("a");
		int count=ele.size();
		System.out.println(count);
		
		List<WebElement> ele1=driver.findElementsByTagName("img");
		System.out.println(ele1.size());
		
		List<WebElement> ele2=driver.findElementsByXPath("//input");
		System.out.println(ele2.size());
		
		List<WebElement> ele3=driver.findElementsByTagName("a");
		int c=ele3.size();
		System.out.println(c);
		
		for(int i=0;i<c;i++)
		{
			WebElement we=ele3.get(i);
			String text=we.getText();
			System.out.println(text);
		}
		
		/*
		for(int i=c-1;i>=0;i--)
		{
			WebElement we=ele3.get(i);
			String text=we.getText();
			System.out.println(text);
		}
		
		*/

	}

}
