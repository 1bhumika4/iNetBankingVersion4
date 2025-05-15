package Sln;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNG6 extends TestNG5 {
	
	@Test
	public void Action() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("bhumika.r.h@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Happiness@5");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
