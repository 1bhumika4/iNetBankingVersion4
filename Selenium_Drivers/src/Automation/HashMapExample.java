package Automation;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapExample {
	
	/*static HashMap<String,String> loginData()
	{
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("X", "bhumika.r.h@gmail.com/Alliswell@145");
		hm.put("Y", "Admin@admin123");
		return hm;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		String creds = loginData().get("X");
		
		System.out.println(creds);
		
		String arr[] = creds.split("/");
		
	   System.out.println(arr[0]);
	   
	   System.out.println(arr[1]);
		
		
		driver.findElementByName("email").sendKeys(arr[0]);
		driver.findElementByName("pass").sendKeys(arr[1]);
		
		
		driver.findElementByName("login").click();*/
	
	
	
	static HashMap<String,String> LoginData()
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("X", "bhumika.r.h@gmail.com/Alliswell@145");
		hm.put("Y", "abc@gmail.com/Test@123");
		return hm;

	}
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		String creds = LoginData().get("X");
		
		String arr[] = creds.split("/");
		
		driver.findElementByName("email").sendKeys(arr[0]);
		driver.findElementByName("pass").sendKeys(arr[1]);
		
		driver.findElementByName("login").click();
		
		
				
				
	}

}
