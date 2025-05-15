package Sln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mdropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele= driver.findElement(By.id("month"));
		Select sel=new Select(ele);
		List<WebElement> l=sel.getOptions();
		ArrayList<String> a=new ArrayList<String>();
		int count=l.size();
		System.out.println(l);
		for(WebElement we:l)
		{
			String text=we.getText();
			a.add(text);
			
		}
		
		Collections.sort(a);
		for(String t:a)
		{
			System.out.println(t);
		}
	}

}
