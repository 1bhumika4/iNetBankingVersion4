package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class XPath4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/xpath.html");
	    
		driver.findElementByXPath("//a[contains(text(),'gmail')]").click();
		

	}

}
