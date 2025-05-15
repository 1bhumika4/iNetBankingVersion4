package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG9 extends TestNG5 {
	
	
	@Test
	public void login()
	{
		driver.findElementByName("email").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementByName("pass").sendKeys("Alliswell@145");
		driver.findElementByName("login").click();
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Facebook");
		System.out.println("continue");
		sa.assertAll();
	}
	

}
