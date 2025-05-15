package TestNewGeneration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void Test1()
	{
		Reporter.log("1",true);
		
	}
	
	@Test(priority=1)
	public void Test2()
	{
		Reporter.log("2", true);
	}
	



}
