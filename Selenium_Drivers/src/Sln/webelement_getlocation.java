package Sln;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_getlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe" );
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("//a[.='English (UK)']"));
org.openqa.selenium.Point loc= ele.getLocation();
System.out.println(loc);

int X=loc.getX();
int Y=loc.getY();
System.out.println(X);
System.out.println(Y);

	}

}
