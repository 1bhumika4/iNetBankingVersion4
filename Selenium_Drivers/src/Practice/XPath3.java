package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/xpath.html");
		//driver.findElementByXPath("//a[text()='gmail']").click();
		
		//or
		
		//driver.findElement(By.xpath("//a[.='gmail']")).click();
		
		//or with multiple attributes
		
		//driver.findElementByXPath("//a[text()='gmail' and @id='i1']").click();
		
		//or
		
		driver.findElementByXPath("//a[.='gmail' and @id='i1']").click();
		
		

	}

}
