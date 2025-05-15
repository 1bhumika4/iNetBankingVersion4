package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=  new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		ArrayList<String> l = new ArrayList<String>(all);
		int count1=l.size();
		System.out.println(count1);
		String w= l.get(2);
		driver.switchTo().window(w);
		driver.close();
		
		
		

	}

}
