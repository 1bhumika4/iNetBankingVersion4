package Automation;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElementById("textbox").sendKeys("testing text file");	
		driver.findElementById("createTxt").click();		
		driver.findElementById("link-to-download").click();
		
		
		Thread.sleep(5000);
		//IsfileExist(String "Downloads/info.txt");"C:\Users\Bhumika\Downloads\info (2).txt"
		
		if((IsfileExist("C:/Users/Bhumika/Downloads/infortxt"))== true)
		{
			System.out.println("File exists");
		}
		
		else
		{
			System.out.println("File does not exists");
		}
		
		

	}

	static boolean 	IsfileExist(String path)
	{
		File f = new File(path);
		if(f.exists())
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
}
