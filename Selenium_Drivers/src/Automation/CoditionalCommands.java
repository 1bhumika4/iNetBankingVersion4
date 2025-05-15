package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElementByName("reg_passwd__");
		
		if(email.isDisplayed() && email.isEnabled())
			
		{
			email.sendKeys("bhumivatsa@gmail.com");
		}
		
		if (password.isDisplayed() && password.isEnabled())
			
		{
			password.sendKeys("Test@123");
			
		}
		
		//System.out.println(driver.findElementByClassName("_58mt").isEnabled());
		//System.out.println(driver.findElementByClassName("_58mt").isEnabled());
		

	}

}
