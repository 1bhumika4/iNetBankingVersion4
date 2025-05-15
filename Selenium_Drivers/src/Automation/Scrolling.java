package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		
		driver.navigate().refresh();
	
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scrollBy(0,1000)", "");
		
	
		
		
		//WebElement flag = driver.findElementByXPath("//*[@id=\"ct-list\"]/table[1]/tbody/tr[86]/td[1]/img");
		
	
	//js.executeScript("arguments[0].scrollIntoView();", flag);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	System.out.println("done");
		
		
		
	}

}
