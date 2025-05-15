package TestNewGeneration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	
	@Test
	public void Compose()
	{
		Reporter.log("Compose", true);
	}
	
	@Test(dependsOnMethods = "Compose")
	public void SentItems()
	{
		Reporter.log("Sent Items", true);
	}
	
	@Test(dependsOnMethods = "SentItems")
	public void Trash()
	{
		Reporter.log("Trash",true);
	}
}









