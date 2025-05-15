package HybridFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	
public static WebDriver driver;


public static void OpenBrowser()
{
	System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
	driver=new ChromeDriver();
	
}

public static void Navigate()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}

public static void Email()
{
	driver.findElement(By.id("email")).sendKeys("bhumika.r.h@gmail.com");
	
}

public static void Password()
{
	driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
}

public static void Login()
{
	driver.findElement(By.name("login")).click();
}

/*public static void CloseBroswer()
{
	driver.quit();
}*/
}
