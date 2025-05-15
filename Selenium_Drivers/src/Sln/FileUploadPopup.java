package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://UploadFilePopup.html");
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("D://links.txt");

	}

}
