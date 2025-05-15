package Practice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent_id=driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		all.remove(parent_id);
		int count1=all.size();
		System.out.println(count1);
		for(String w:all)
		{
			driver.switchTo().window(w);
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}
		
		
	}

}
