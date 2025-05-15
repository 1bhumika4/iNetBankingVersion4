package Sln;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG8 extends TestNG5 {
	
	//Soft Assert
	@Test
	public void Test()
	{
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "Facebook");
		System.out.println("1");
		sa.assertAll();

		
		
	}
	
	

}
