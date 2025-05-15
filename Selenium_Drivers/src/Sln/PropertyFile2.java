package Sln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile2 {
	/*
	@Test
	public void test_file() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\Bhumika\\eclipse-workspace\\Selenium_Drivers\\src\\Sln\\p.properties"));
		String val=p.getProperty("UN");
		System.out.println(val);
		
	*/
	
	
	@Test
	public void test(String path, String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		String val=p.getProperty(key);
		System.out.println(val);
		
		
	}

}
