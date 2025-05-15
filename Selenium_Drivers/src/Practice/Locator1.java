package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/Locator.html");
		//driver.findElement(By.id("i1")).click();
		
		//driver.findElement(By.name("n1")).click();
		
		//driver.findElement(By.className("c1")).click();
		
	    //driver.findElementByClassName("c1").click();
	    
	    //driver.findElementByLinkText("Gmail").click();
		
		//driver.findElementByPartialLinkText("Gma").click();
		
		driver.findElementByTagName("a").click();

	}

}
