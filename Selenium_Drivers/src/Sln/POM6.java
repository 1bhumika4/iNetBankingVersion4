package Sln;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM6 {

	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		POM5 p=new POM5(driver);
		p.SetEmail("bhumika.r.h@gmail.com");
		p.SetPassword("Alliswell@145");
		p.Login();
	}
}
