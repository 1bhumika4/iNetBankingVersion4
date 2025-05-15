package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/isEnabled.html");
		WebElement ele=driver.findElementByXPath("//input[@value='abc']");
		if(ele.isEnabled())
			System.out.println("textbox is enabled");
		else
			System.out.println("textbox is not enabled");

	}

}
