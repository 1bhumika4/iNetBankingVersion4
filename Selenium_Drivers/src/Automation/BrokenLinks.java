package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/index.html");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElementsByLinkText("a");
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) 
		{
			WebElement element = links.get(i);
			
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			
		   httpConn.connect();
			
			
			int rescode = httpConn.getResponseCode();
			
			if(rescode>=400)
			{
				System.out.println(url+"-"+"is broken link");
			
			}
			
			else
			{
				System.out.println(url+"-"+"is a valid link");
				
			}
			
		}
		
		

	}

}
