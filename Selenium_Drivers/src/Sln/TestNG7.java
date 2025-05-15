package Sln;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 extends TestNG5 {
	@Test
	public void Action() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Happiness@5");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"Facebook");
		//Assert.assertEquals(title, "Facebook ?? ?????? ????");
		Assert.assertTrue(title.contains("Facebook"));
		System.out.println("1");
	}


}
//fail test case