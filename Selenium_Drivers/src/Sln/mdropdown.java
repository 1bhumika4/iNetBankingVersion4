package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://mdropdown.html");
		WebElement ele=driver.findElement(By.id("menu"));
		Select sel=new Select(ele);
	//	sel.selectByValue("a");
		sel.selectByIndex(0);
		//sel.selectByVisibleText("Akki rotti");
		sel.deselectAll();
		boolean b=sel.isMultiple();
		if(b)
			System.out.println("Multiple dorpdown");
		else
			System.out.println("not multiple");
	

	}

}
