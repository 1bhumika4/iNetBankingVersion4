package TestNewGeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends Generic  {
	
	//public WebDriver driver;

	/*
	 * @Test public void Login() throws InterruptedException {
	 * driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
	 * driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
	 * 
	 * driver.findElement(By.name("login")).click(); Thread.sleep(3000);
	 * 
	 * String title = driver.getTitle(); System.out.println(title);
	 * 
	 * String actTitle = "Log in to Facebook";
	 * 
	 * Assert.assertEquals(title, actTitle);
	 * 
	 * 
	 * }
	 */
	
	
	
	@Test
	public void Login()
	{
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Alliswell@145");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		String actTitle = "Facebook!";
		
		SoftAssert sa = new SoftAssert();

		
		System.out.println(title);
		Assert.assertEquals(title, actTitle);
		System.out.println("1");
		sa.assertAll();
	}

}
