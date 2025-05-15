package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/isDisplayed.html");
		driver.findElementByXPath("//input[@value='abc']").clear();

	}

}
