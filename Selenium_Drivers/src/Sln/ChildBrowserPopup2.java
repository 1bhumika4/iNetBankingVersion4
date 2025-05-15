package Sln;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> all=driver.getWindowHandles();
		driver.manage().window().maximize();
		int count=all.size();
		System.out.println(count);
		for(String s:all)
		{
			System.out.println(s);
		}
        
	}

}
//count the number of browsers and print the parent id of all those browsers