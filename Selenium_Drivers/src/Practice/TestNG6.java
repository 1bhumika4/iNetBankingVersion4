package Practice;

import org.testng.annotations.Test;

public class TestNG6 extends TestNG5 {
	
	@Test
	public void login()
	{
		driver.findElementByName("email").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementByName("pass").sendKeys("Alliswell@145");
		driver.findElementByName("login").click();
		String title= driver.getTitle();
		System.out.println(title);
	}

}
