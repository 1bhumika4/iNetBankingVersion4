package Practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("D://Practice/MultiSelectDropdown.html");
	  WebElement ele= driver.findElementById("Food Cusines");
	  Select s = new Select(ele);
	  List<WebElement> options = s.getOptions();
	  TreeSet<String> t=new TreeSet<String>();
	  for(WebElement we:options)
	  {
		  String text = we.getText();
		  t.add(text);
		  t.remove("Italian");
		  
	  }
	  System.out.println(t);
	  if(t.contains("Indian"))
	  {
		  System.out.println("present");
		  
	  }
	  else
	  {
		  System.out.println("Not present");
	  }

	}

}
