package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class backward_forward_refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
