package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
				
      ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	//Object Creation
	
		
		preg p = new preg(driver);
		
		
		p.SetFirstName("Anu");
		p.SetLastName("Rao");
		p.SetAddress("Bangalore");
		p.SetEmail("Anu@gmail.com");
		p.SetPhone("9786543210");
		p.SetGender();
		p.SetHobbies();
		p.SetSkills("CSS");
		//p.SetCountry(1);
		p.SetYear("1997");
		p.SetMonths("May");
		p.SetDays("10");
		p.SetPassword("Test@123");
		p.SetConfirmPassword("Test@123");
		p.SetRefresh();
		
		System.out.println("Completed");
		

	
	

	}

}
