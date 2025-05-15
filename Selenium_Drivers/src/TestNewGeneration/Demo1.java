package TestNewGeneration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test
	public void Test1()
	{
		Reporter.log("1",true);
	}
	
	@Test
	public void Test2()
	{
		Reporter.log("2",true);
	}

}
