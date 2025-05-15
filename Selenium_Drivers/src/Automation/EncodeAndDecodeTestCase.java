package Automation;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodeAndDecodeTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		//http://demo.nopcommerce.com/login"   QWxsaXN3ZWxsQDE0NQ==
		
		
		driver.findElementById("email").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementById("pass").sendKeys("QWxsaXN3ZWxsQDE0NQ==");
		
		driver.findElementById("loginbutton").click();
		

	}
	
	
	static String Decode(String password)
	{
		byte[] decodedString = Base64.decodeBase64(password);
		return (new String(decodedString));
		
		
		}

}


/*
 * https://mvnrepository.com/artifact/com.google.zxing/javase/3.3.3
 * 
 * https://mvnrepository.com/artifact/com.google.zxing/core/3.3.3
 * 
 * https://barcode.tec-it.com
 */