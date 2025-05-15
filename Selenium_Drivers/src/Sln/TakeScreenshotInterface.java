package Sln;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotInterface {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File dst=new File("D://3.jpg");
	    FileUtils.copyFile(src, dst);
	
		/*
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("D://2.jpg");
		FileUtils.copyFile(src, dst);
		*/
		
	/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("D://1.jpg");
	    FileUtils.copyFile(src,dst);
	    */

	}

}
