package Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/isDisplayed.html");
		WebElement ele=driver.findElementByXPath("//input[@value='abc']");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.DELETE);

	}

}
