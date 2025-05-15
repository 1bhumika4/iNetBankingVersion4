package Sln;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void Test1()
	{
		Reporter.log("1", true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("2", false);
	}

}
