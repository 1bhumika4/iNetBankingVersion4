package Sln;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("D://javaexec.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('i1').value='pqr'");
		js.executeScript("document.getElementById('i1').value=''");
		
		
		
	

	}

}
