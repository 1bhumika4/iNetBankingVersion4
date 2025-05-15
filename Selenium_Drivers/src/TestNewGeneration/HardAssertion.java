package TestNewGeneration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.Systematiser;

public class HardAssertion {
	
	/*
	 * @Test public void Test1() { Assert.assertTrue(true);//true
	 * 
	 * SoftAssert sa = new SoftAssert(); Assert.assertEquals("welcome",
	 * "welcome");//pass Assert.assertEquals("Selenium", "Selenium");//pass
	 * System.out.println("Pass"); sa.assertAll(); }
	 */
	
	
	/*
	 * @Test public void Test1() { Assert.assertTrue(true);
	 * Assert.assertEquals("welcome", "welcome"); Assert.assertEquals("Selenium",
	 * "selenium"); System.out.println("pass"); }
	 */
	
	
	@Test
	public void Test1()
	{
		Assert.assertTrue(true);
		Assert.assertEquals("welcome", "welcome");
		Assert.assertEquals("Selenium", "selenium");
		System.out.println("successfully passed");
	}
	
	

}
