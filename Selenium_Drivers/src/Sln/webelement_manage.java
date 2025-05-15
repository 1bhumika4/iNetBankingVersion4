package Sln;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(200,300);
	//	driver.manage().window().setSize(d);
		
		driver.manage().deleteAllCookies();
        
	}

}
