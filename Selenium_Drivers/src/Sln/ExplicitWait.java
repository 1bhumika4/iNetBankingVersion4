package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D://login.html");
        driver.findElement(By.name("email")).sendKeys("anu@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("honesty@123");
        driver.findElement(By.name("login")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Login Page"));
        String title=driver.getTitle();
        System.out.println(title);
	}

}
