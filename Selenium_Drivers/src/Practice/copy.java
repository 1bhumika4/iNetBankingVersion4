package Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/Copy.html");
		WebElement ele=driver.findElementByXPath("//input[@value='abc']");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		WebElement ele1=driver.findElementByXPath("//input[@value='xyz']");
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"v");

	}

}
