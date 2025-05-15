package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class POM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		POM1 p = new POM1(driver);
		p.login();
		driver.navigate().refresh();
		p.login();
				

	}

}
