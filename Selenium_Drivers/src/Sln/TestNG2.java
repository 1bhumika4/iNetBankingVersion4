package Sln;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {

@Test(priority=1)
public void Test1()
{
Reporter.log("1", true);	
}

@Test(priority=2)
public void Test2()
{
	Reporter.log("2", false);
}

@Test(priority=0)
public void Test3()
{
Reporter.log("true");
}
	
	
}
