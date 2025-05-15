package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://webelement_isselected.html");
		
		WebElement ele= driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(ele.isSelected())
        System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
	}

}
