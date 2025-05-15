package TestNewGeneration;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	
	public void pnTestStart(ITestResult tr)
	{
		System.out.println("Tets started");
	}
	
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("test passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("test failed");
		
	}

	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test skipped");
	}
}
