package Practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_using_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> ele=driver.findElementsByTagName("a");
		int count=ele.size();
		System.out.println(count);
		for(WebElement we:ele)
		{
			String text=we.getText();
			System.out.println(text);
		}
		
		List<WebElement> ele1=driver.findElementsByTagName("img");
		int count1=ele1.size();
		System.out.println(count1);
		for(WebElement we1:ele1)
		{
			String text1=we1.getText();
			System.out.println(text1);
		}

	}

}
