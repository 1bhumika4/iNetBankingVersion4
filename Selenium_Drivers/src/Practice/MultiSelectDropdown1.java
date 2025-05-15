package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/MultiSelectDropdown.html");
		WebElement ele = driver.findElementById("Food Cusines");
		Select s = new Select(ele);
		s.selectByValue("1");
		s.selectByVisibleText("Italian");
		s.deselectByVisibleText("Italian");
		if(s.isMultiple())
		System.out.println("MultiSelect dropdown");
		else
			System.out.println(" Not a MultiSelect dropdown");
		

	}

}
