package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D:/Practice/JE.html");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t1').value='def'");
		js.executeScript("document.getElementById('t1').value=''");
		js.executeScript("document.getElementById('t1').value='abc'");
		
				
				
				
	}

}
