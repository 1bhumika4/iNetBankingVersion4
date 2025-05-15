package TestNewGeneration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion1 {
	
	
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void Test1()
	{
		sa.assertTrue(true);
		sa.assertEquals("welcome", "welcome");
		sa.assertEquals("Selenium", "selenium");
		System.out.println("Successfully passed");
		sa.assertAll();
	}

}
