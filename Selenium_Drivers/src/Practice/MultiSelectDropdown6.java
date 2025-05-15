package Practice;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D://Practice/MultiSelectDropdown.html");
		WebElement ele= driver.findElementById("Food Cusines");
		Select s = new Select(ele);
		List<WebElement> l= s.getOptions();
		TreeSet<String> t=new TreeSet<String>();
		int count = l.size();
		System.out.println(count);
		for(WebElement we:l)
		{
			String text = we.getText();
			System.out.println(text);
			t.add(text);
			
		}
		
		for(String b:t)
		{
			System.out.println(b);
		}
		
		
		//reverse order
		
		TreeSet<String> t1=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement we1:l)
		{
			String text1= we1.getText();
			System.out.println(text1);
			t1.add(text1);
		}
		for(String d:t1)
		System.out.println(d);

	}

}
