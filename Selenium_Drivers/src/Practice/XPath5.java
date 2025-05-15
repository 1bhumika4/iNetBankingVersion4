package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/nbsp.html");
		WebElement ele=driver.findElementByXPath("//span[contains(text(),'Asia')]");
		System.out.println("1");
		
		//tried in try Xpath
		

	}

}
