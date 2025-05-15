package Sln;

import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivinsionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElementByXPath("(//:[text()='Cal'])[1]").click();
		driver.findElementByXPath("(//a[.='3'])[2]").click();
		

	}

}
