package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title, PageSource, URL;
		title=driver.getTitle();
		PageSource=driver.getPageSource();
		URL=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(PageSource);
		System.out.println( URL);

	}

}
