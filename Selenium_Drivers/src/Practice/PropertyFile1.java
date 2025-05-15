package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile1 {
	
	@Test
	public void get() throws FileNotFoundException, IOException
	{
		
		Properties p = new Properties();
		p.load(new FileInputStream("C:\\Users\\Bhumika\\eclipse-workspace\\Selenium_Drivers\\src\\Practice\\pf.properties"));
		String val = p.getProperty("UserName");
		System.out.println(val);
	}

}
