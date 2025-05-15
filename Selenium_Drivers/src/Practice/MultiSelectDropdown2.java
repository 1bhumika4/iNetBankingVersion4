package Practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("D://Practice/MultiSelectDropdown.html");
		WebElement ele = driver.findElementById("Food Cusines");
		Select s = new Select(ele);
		List<WebElement> we = s.getOptions();
		int count= we.size();
		System.out.println(count);
	}

}
