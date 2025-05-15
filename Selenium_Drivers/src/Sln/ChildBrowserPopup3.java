package Sln;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> all=driver.getWindowHandles();
		for(String s:all)
		{
			driver.switchTo().window(s);
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		
	}

}
