package Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class drag_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		

	}

}
