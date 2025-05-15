package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/isDisplayed.html");
		WebElement ele=driver.findElementByXPath("//input[@value='abc']");
		if(ele.isDisplayed())
			System.out.println("textbox is displayed");
		else
			System.out.println("textbox is not displayed");
		

	}

}
