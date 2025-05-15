package Sln;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mdropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> options=s.getOptions();
		int count=options.size();
		System.out.println(count);
		for(WebElement text:options)
		{
			String s1=text.getText();
			System.out.println(s1);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	WebElement ele=driver.findElement(By.id("year"));
		Select s=new Select(ele);
		List<WebElement> options=s.getOptions();
		int size=options.size();
		System.out.println(size);*/
		

	}

}
