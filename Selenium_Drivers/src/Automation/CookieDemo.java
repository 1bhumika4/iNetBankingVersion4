package Automation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies=driver.manage().getCookies();// gets all the cookies created and stores it in a set
		System.out.println("Number of cookies:"+cookies.size());// gives the number of cookies
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());//reads and prints out name and value of each cookie
		}
		
		System.out.println(driver.manage().getCookieNamed("csm-sid"));// gives the cookeis based on the cookie name
		
		
		
		
		Cookie cobj = new Cookie("mycookie12345","12345");
		
		driver.manage().addCookie(cobj);
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Number of cookies:"+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		/*
		driver.manage().deleteCookie(cobj);
		
		cookies= driver.manage().getCookies();
		
		System.out.println("Number of cookies:"+cookies.size());
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		*/
		
		/*driver.manage().deleteCookieNamed("mycookie12345");
cookies= driver.manage().getCookies();
		
		System.out.println("Number of cookies:"+cookies.size());
		
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		*/
		
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		
		System.out.println("number of cookies:"+cookies.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
