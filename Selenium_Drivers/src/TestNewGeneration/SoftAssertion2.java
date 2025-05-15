package TestNewGeneration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion2 {
	
	
	SoftAssert sa  = new SoftAssert();
	@Test
	public void Test1()
	{
		sa.assertEquals("Wel", "wel");
		sa.assertAll();
	}
	
	@Test
	public void Test2()
	{
		sa.assertEquals("Sel", "Sel");// though this is a pass still the report will show as fail as the object used in both the methods are same
		sa.assertAll();
	}
}
