package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptExecutor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.alibaba.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement ele= driver.findElementByXPath("//a[text()='Resources']");
		Point p = ele.getLocation();
		System.out.println(p);
		int x= p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();

	}

}
