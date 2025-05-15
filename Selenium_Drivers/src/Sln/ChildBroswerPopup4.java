package Sln;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroswerPopup4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent_id=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		for(String s:all)
		{
			driver.switchTo().window(s);
			String title=driver.getTitle();
			System.out.println(title);
			if(s.equals(parent_id))
			{
				driver.close();
				System.out.println("Parent broswer is closed");
			}
		}

	}

}
