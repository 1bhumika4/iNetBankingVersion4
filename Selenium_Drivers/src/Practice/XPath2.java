package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//input[@name='email' and @id='email']").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementByXPath("//input[@name='pass' and @id='pass']").sendKeys("Alliswell@145");
		driver.findElementByXPath("//button[@name='login' and @type='submit']").click();
		
		
		
		

	}

}
