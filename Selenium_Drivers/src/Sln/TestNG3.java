package Sln;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(invocationCount=3)
	public void Test1()
	{
		Reporter.log("1", true);
	}
	
	@Test(invocationCount=0)
	public void Test2()
	{
		Reporter.log("2", false);
	}

}
