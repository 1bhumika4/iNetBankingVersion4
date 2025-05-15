package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input").sendKeys("Anu");//firtsname
        driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input").sendKeys("Rao");//lastname
        
        driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea").sendKeys("testing");// address
        
        driver.findElementByXPath("//*[@id=\"eid\"]/input").sendKeys("abc@gmail.com"); //email
        
        driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input").sendKeys("9876543210");//phone
        
       System.out.println( driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]").isSelected());//female radio button selected?
       
       driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]").click();//female radio button selected
       
       driver.findElementById("checkbox1").click();//hobbies checkbok selected crickeet
       driver.findElementById("checkbox2").click();//hobbies checkbok selected movies
       
       
       
       WebElement country=driver.findElementById("country");
       Select sc = new Select(country);
       sc.selectByVisibleText("India");
       
       WebElement year = driver.findElementById("yearbox");
       Select y = new Select(year);
       y.selectByVisibleText("year");
       
       
       WebElement month = driver.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
       Select m = new Select(month);
       m.selectByVisibleText("July");
       
       WebElement day = driver.findElementById("daybox");
       Select d = new Select(day);
       d.selectByVisibleText("14");
       
       
       driver.findElementById("firstpassword").sendKeys("Test@123");
       driver.findElementById("secondpassword").sendKeys("Test@123");
       
       
       driver.findElementById("Button1").click();
       
       
       


	}

}
