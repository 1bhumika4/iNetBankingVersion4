package Sln;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent_id=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		int count=all.size();
		System.out.println(count);
		all.remove(parent_id);
		int count1=all.size();
		System.out.println(count1);
		for(String s:all)
		{
			if(s.equals(parent_id))
			{
				System.out.println("parent id cannot be closed as it is removed");
			}
			else
			{
				driver.switchTo().window(s);
				driver.close();
				System.out.println("child browsers are closed");
					
			}
			
			
		}
		
		
		
		
		

	}

}
