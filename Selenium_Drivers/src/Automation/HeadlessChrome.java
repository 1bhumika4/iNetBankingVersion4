package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
				//options.addArguments("--headless--");
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.saucedemo.com/");
				System.out.println("Title of the page:"+driver.getTitle());
				

	

	}

}
