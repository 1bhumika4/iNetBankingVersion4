package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class XPath6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		
		//title//
		
		/*String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("actiTIME - Time Tracking Software for Boosting Your Business"))
			System.out.print("true");
		else
			System.out.println("false");
			*/
		
		
		//GetURL
		
		/*String URL=driver.getCurrentUrl();
		System.out.println(URL);
		if(URL.contains("https://www.actitime.com/"))
			System.out.print("true");
		else
			System.out.println("false");
			*/
		
		//title// Get Dynamic title
		
				/*String title=driver.getTitle();
				System.out.println(title);
				if(title.contains("actiTIME"))
					System.out.print("true");
				else
					System.out.println("false");
					*/
		
		//GetURL Dynamic URL
		
				String URL=driver.getCurrentUrl();
				System.out.println(URL);
				if(URL.contains("https"))
					System.out.print("true");
				else
					System.out.println("false");
					
		
		
		

	}

}
