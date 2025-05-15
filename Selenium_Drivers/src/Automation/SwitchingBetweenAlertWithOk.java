package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenAlertWithOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a").click();
		driver.findElementByXPath("//*[@id=\"OKTab\"]/button").click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	
		

	}

}
