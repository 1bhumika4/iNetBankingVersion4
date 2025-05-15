package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
	
	
	@Test(priority=1 , invocationCount=2)
	public void Test1()
	{
		Reporter.log("1",true);
	}
	
	@Test
	public void Test2()
	{
		Reporter.log("2",false);
	}

}
