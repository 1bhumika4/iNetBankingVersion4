package Practice_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.close();
		

	}

}
