package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByName("email").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementByName("pass").sendKeys("Alliswell@145");
		driver.findElementByName("login").click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		String title= driver.getTitle();
		System.out.println(title);

	}

}
