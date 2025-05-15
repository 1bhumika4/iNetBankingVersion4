package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://Practice/isSelected.html");
		WebElement ele=driver.findElementByXPath("//input[@type='checkbox']");
		if(ele.isSelected())
			System.out.println("checkbox is selected");
		else
			System.out.println("checkbox is not selected");
		
	}

}
