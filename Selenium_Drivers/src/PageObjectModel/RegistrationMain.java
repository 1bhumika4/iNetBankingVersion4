package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//RegistrationType1 r1 = new RegistrationType1(driver);
		RegistrationType2 r2 = new RegistrationType2(driver);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		r2.SetFirstName("Anusha");
		  r2.SetLastName("Rao");
		  r2.SetAddress("Bangalore");
		  r2.SetEmail("Anu@gmail.com");
		  r2.SetPhone("9876543210");
		  r2.SetGender();
		  r2.SetHobbies();
		  //r1.SetLanguage("English"); 
		  r2.SetSkills("CSS");
		  //r2.SetCountry(2); 
		  r2.SetYear("1997");
		  r2.SetMonths("July");
		  r2.SetDays("14");
		  r2.SetPassword("Test@123");
		  r2.SetConfirmPassword("Test@123"); 
		  r2.SetRefresh();
		  
		  System.out.println("Done");
		  
		 


	}

}
