package Practice_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title, url, pageSource;
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		pageSource=driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		System.out.println(pageSource);
		
		
		

	}

}
