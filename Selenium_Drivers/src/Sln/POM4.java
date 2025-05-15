package Sln;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM4 {
	
	@Test
	public void hello() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./WebDriver./chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		POM3 po=new POM3(driver);
		po.setUN("bhumika.r.h@gmail.com");
		Thread.sleep(3000);
		po.setPWD("Alliswell@145");
		Thread.sleep(3000);
		po.LoginClk();
		
		
	}

}
