package TestNewGeneration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Login1 extends Generic {
	
	@Test
	public void Test()
	{
		WebElement uname = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		
		Assert.assertTrue(uname.isDisplayed());
		uname.sendKeys("bhumika.r.h@gmail.com");
		
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("Alliswell@145");
		
		driver.findElement(By.name("login")).click();
		
		String expTitle = driver.getTitle();
		String actTitle = "Facebook";
		
		Assert.assertEquals(expTitle, actTitle);
	}

}
