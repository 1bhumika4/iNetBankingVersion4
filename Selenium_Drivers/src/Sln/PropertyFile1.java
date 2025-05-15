package Sln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile1 {
	
	@Test
	public void test() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream ("C:\\Users\\Bhumika\\eclipse-workspace\\Selenium_Drivers\\src\\Sln\\p.properties"));
		String val = p.getProperty("UN");
		System.out.println(val);
	}

}
