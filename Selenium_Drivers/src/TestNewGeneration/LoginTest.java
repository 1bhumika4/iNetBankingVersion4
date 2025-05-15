package TestNewGeneration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login by Email");
		Assert.assertEquals("anu","anu");//pass
		
		
	}
	
	
	@Test
	public void loginByFacebook()
	{
		System.out.println("Login by Facebook");
		Assert.assertEquals("wel", "come");//email
	}

}
