package Sln;

import org.openqa.selenium.chrome.ChromeDriver;

public class POM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		POM1 p=new POM1(driver);
	    p.ClickLogin();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    p.ClickLogin();
		
		
	}

}
