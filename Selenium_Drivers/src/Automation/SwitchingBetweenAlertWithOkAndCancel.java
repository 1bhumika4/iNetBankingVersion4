package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenAlertWithOkAndCancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a").click();
		
		driver.findElementByXPath("//*[@id=\"CancelTab\"]/button").click();
		
		String expTextOk = "You pressed Ok";
		
		driver.switchTo().alert().accept();
		
		String actTextOk = driver.findElementByXPath("//*[@id=\"demo\"]").getText();
		
		if((expTextOk.equals(actTextOk))==true)
		{
			System.out.println("test is passed");
		}
		
		driver.findElementByXPath("//*[@id=\"CancelTab\"]/button").click();
		
		String expTextCancel = "You Pressed Cancel";
		
		driver.switchTo().alert().dismiss();
		
		String actTextCancel = driver.findElementByXPath("//*[@id=\"demo\"]").getText();
		
		if(expTextCancel.equals(actTextCancel))
		{
			System.out.println("test is passed");
		}

		
		
		
		
		

		
		

	}

}
