package JavaScriptDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		
		WebElement login = driver.findElementById("loginbutton");
		
		//javaScriptUtil.flash(login, driver);
		/*
		 * javaScriptUtil.draw(login, driver);
		 * 
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); File
		 * tar = new
		 * File("C://Users/Bhumika/eclipse-workspace/Selenium_Drivers/Images/img1.png");
		 * FileUtils.copyFile(src, tar);
		 */
		
		
		//System.out.println(driver.getTitle());
		
		String title = javaScriptUtil.getTiltle(driver);
		System.out.println(title);
		
		//javaScriptUtil.clickElementsByJS(login, driver);
		
		//javaScriptUtil.generateAlert(driver, "You clicked the login button!");
		
		javaScriptUtil.refreshPage(driver);
		
		
		
		
		
		

	}

}
