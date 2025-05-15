package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElementById("dropdowm-menu-1");
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		List originallist = new ArrayList();
		
		for(WebElement e:options)
		{
			originallist.add(e.getText());
		}
		
		System.out.println("original list:"+originallist);
		
		List templist = new ArrayList();
		templist = originallist;
		
		Collections.sort(templist);
		
		System.out.println("templist list:"+templist);
		System.out.println("original list:"+originallist);
		
		if(templist.equals(originallist))
			
		{
			System.out.println("List is sorted");
		}
		
		else
			
		{
			System.out.println("list is not sorted");
		}
		
*/
		
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		WebElement element = driver.findElementById("dropdowm-menu-1");
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		
		List originallist = new ArrayList();
		List templist = new ArrayList();
		
		
		

		for(WebElement e:options)
		{
			originallist.add(e.getText());
		}
		
		templist= originallist;
		
		System.out.println("Original list list:"+originallist);
		System.out.println("Temporary list:"+templist);
		
		Collections.sort(templist);
		
		System.out.println("Temporary list:"+templist);
		
		System.out.println("Original list list:"+originallist);
		
		if(originallist.equals(templist))
		{
			System.out.println("list is sorted");
		}
		
		else
		{
			System.out.println("list is not sorted");
		}
		
		
		
	
		
		
		
		/*
		WebElement element = driver.findElementById("dropdowm-menu-1");//locating the dropdown
		
		Select sel = new Select(element);//reading the element s from the dropdown
		
		List originallist = new ArrayList();//need to store it in a list
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement e:options)
		{
			originallist.add(e.getText());
			
		
		}
		
		System.out.println("Original list:"+originallist);
		
		List templist = new ArrayList();
		
		templist = originallist;
		
		Collections.sort(templist);
		
		System.out.println("Temporary list:"+templist);
		
		System.out.println("Original list:"+originallist);
		
		if(templist.equals(originallist))
		{
			System.out.println("List is sorted");
		}
		
		else
		{
			System.out.println("List is not sorted");
		}
		
		*/
	}



}
