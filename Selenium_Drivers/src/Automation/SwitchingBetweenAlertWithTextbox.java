package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenAlertWithTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a").click();
		
		driver.findElementByXPath("//*[@id=\"Textbox\"]/button").click();
		
		driver.switchTo().alert().sendKeys("Bhumika");
		
		driver.switchTo().alert().accept();
		
		String expTxt= "Hello Bhumika How are you today";
		
		String actTxt = driver.findElementByXPath("//*[@id=\"demo1\"]").getText();
		
		
		if((actTxt.equals(expTxt))==true)
		{
			System.out.println("Test is passed");
		}

		
		else
		{
			System.out.println("Test is failed");
		}
	}

}
