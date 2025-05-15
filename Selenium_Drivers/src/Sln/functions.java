package Sln;

import org.openqa.selenium.chrome.ChromeDriver;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		if(title.equals("Facebook "))
			System.out.println("pass");
		else
			System.out.println("fail");
			*/
		

	/*	driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.facebook.com/"))
			System.out.println("pass");
		else
			System.out.println("fail");
			*/
		
		
	
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		if(title.contains("Enter "))
			System.out.println("pass");
		else
			System.out.println("fail");
			
		
		/*driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https"))
			System.out.println("pass");
		else
			System.out.println("fail");
		*/
			
		
		
		
	}

}
