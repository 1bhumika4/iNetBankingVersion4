package Practice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String parent_id=driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String w:all)
		{
			driver.switchTo().window(w);
			String title= driver.getTitle();
			System.out.println(title);
			if(title.equals("Tech Mahindra"))
			{
				driver.close();
			}
		}

	}

}
