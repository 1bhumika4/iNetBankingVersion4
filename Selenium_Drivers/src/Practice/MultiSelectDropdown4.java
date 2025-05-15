package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElementById("month");
		Select s = new Select(ele);
		List<WebElement> options= s.getOptions();
		ArrayList<String> l = new ArrayList<String>();
		int count = options.size();
		System.out.println(count);
		for(WebElement we:options)
		{
			String text= we.getText();
			System.out.println(text);
			l.add(text);
		}
		
		Collections.sort(l);
		
		for(String t:l)
		{
			System.out.println(t);
		}
		
		
		
		

	}

}
