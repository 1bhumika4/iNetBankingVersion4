package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D://Practice/SingleSelectDropdown.html");
		WebElement ele=driver.findElementById("Food Cusines");
		Select s = new Select(ele);
		s.selectByIndex(2);
		//s.deselectAll();
		

	}

}
