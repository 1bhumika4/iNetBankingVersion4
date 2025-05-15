package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElementById("dropdowm-menu-1"); //locating the dropdown
		Select sel = new Select(element); //reading the dropdown
		List<WebElement> options = sel.getOptions(); //get all the options from the dropdown as it's a list using List
		
		List originallist = new ArrayList(); // List is an interface as it can't be defined only declared using ArrayList
		List templist = new ArrayList();//temporary list is created
		
		for(WebElement e:options)
		{
			originallist.add(e.getText()); //added all the options to teh original   list that was captured from teh dropdown
			templist.add(e.getText());
		}
		
		System.out.println("OriginalList before sorting:"+originallist);
		System.out.println("Temporary list before sorting:"+templist);
		
	
		
		Collections.sort(templist);
		
		
		System.out.println("OriginalList after sorting:"+originallist);
		
		System.out.println("Templist after sorting:"+templist);

		
		
		if(templist.equals(originallist))
			
		{
			System.out.println("list is sorted");
		}
		
		else
		{
			System.out.println("list is not sorted");
		}
		
			


	}

}
