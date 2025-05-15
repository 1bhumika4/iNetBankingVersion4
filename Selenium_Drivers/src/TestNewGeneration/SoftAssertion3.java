package TestNewGeneration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion3 {
	
	
	SoftAssert sa1 = new SoftAssert();
	SoftAssert sa2 = new SoftAssert();
	
	@Test
	public void Test1()
	{
		sa1.assertEquals("Wel", "wel");
		sa1.assertAll();
	}
	
	
	@Test
	public void Test2()
	{
		sa2.assertEquals("Sel", "Sel");// since different objects are created the test case which is pass will be shown as pass in the report as well
		sa2.assertAll();
	}

}
