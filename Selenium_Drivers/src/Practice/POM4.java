package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class POM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		POM3 p = new POM3(driver);
		p.sendEmail("bhumika.r.h@gmail.com");
		p.sendPassword("Alliswell@145");
		p.loginclk();
		//driver.navigate().refresh();
		//p.loginclk();
				

	}

}
