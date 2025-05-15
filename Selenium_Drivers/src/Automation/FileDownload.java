package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		//downloading text file//
		
		driver.findElementById("textbox").sendKeys("Testing text file");
		
		driver.findElementById("createTxt").click();
		
		driver.findElementById("link-to-download").click();
		
		//downloading pdf files
		
		driver.findElementById("pdfbox").sendKeys("Testing pdf files");
		
		driver.findElementById("createPdf").click();
		
		driver.findElementById("pdf-link-to-download").click();
		


	}

}
