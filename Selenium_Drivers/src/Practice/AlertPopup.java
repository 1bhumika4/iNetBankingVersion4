package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElementByName("cusid").sendKeys("hello");
		driver.findElementByName("submit").click();
		Alert a =driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.dismiss();
		
	}

}
