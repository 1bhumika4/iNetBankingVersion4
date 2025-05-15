package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class FileUploadUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);

		builder.moveToElement(driver.findElement(By.xpath("//*[@id='imagesrc']"))).click().build().perform();
		
		
		
		// driver.findElementById("imagesrc").click();
		

		Screen s = new Screen();
		
		String imagespath = "C:\\Users\\Bhumika\\eclipse-workspace\\Selenium_Drivers\\Images\\";
		
		String filepath = "C:\\Users\\Bhumika\\eclipse-workspace\\Selenium_Drivers\\Images\\";
		
		Pattern fileinput = new Pattern(imagespath+"fname.png");
		
		Pattern openbutton = new Pattern(imagespath+"opn.png");
		
		Thread.sleep(3000);
		
		s.wait(fileinput,20);
		
		s.type(fileinput,filepath+"sofa.png");
		
		//s.click(openbutton);
		
		
		
		
		
		
	
				
		
		

	}

}
