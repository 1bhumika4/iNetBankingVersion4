package Automation;

import java.util.logging.LogManager;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;


public class Log4jExample {
	
	 private static Logger logger1 = Logger.getLogger(Log4jExample.class);//
	 
	//private static final Logger logger1 = Logger.getLogger(Log4jExample.class);
	//private static Logger logger = LogManager.getLogger(Log4jExample.class);
	
	//static Logger logger = Logger.getLogger(CurrentClass.class.getName());
	 
	 static Logger log = Logger.getLogger(Log4jExample.class);

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		//Logger log = LogManager.getLogger(Log4jExample.class);
	
				
				//Logger logger1 = Logger.getLogger(Log4jExample.class.getClass());
				
				//Logger logger=Logger.getLogger(Log4jExample.class);
		
	
		//private static Logger Log = Logger.getLogger(Log.class.getName());//
		
		//Logger logger = Logger.getLogger(Log4jExample.class);
		
		//Logger logger1 = Logger.getLogger(Class.forName("Log4jExample"));
		//DOMConfigurator.configure("log4j.xml");
		
		PropertyConfigurator.configure("log4j2.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		

		
		
		log.info("Browser window opened");
		
		driver.get("https://www.facebook.com/login.php/");
		
		log.info("Opened the URL");
		log.info("Entering the details for username");
		
		driver.findElementByName("email").sendKeys("bhumika.r.h@gmail.com");
		
		log.info("Entering the details for password");
		driver.findElementByName("pass").sendKeys("Alliswell@145");
		
		log.info("Clicking on login button");
		
		driver.findElementByName("login").click();
		
		log.info("Test case ended");
		
		
		
	
		
		
		

	}

}
