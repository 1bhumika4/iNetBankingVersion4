package Practice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> all = driver.getWindowHandles();
		int count=all.size();
		System.out.println(count);
		for(String w:all)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		
	}

}
