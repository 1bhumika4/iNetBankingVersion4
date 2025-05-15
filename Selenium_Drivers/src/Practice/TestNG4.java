package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
	
	
	@Test
	public void Compose()
	{
		Reporter.log("Compose",true);
		
	}
	
	@Test(dependsOnMethods="Compose")
	public void SentItems()
	{
		Reporter.log("SentItems",true);
	}
	
	
	@Test(dependsOnMethods="SentItems")
	public void Trash()
	{
		Reporter.log("Trash",true);
		
	}

}
