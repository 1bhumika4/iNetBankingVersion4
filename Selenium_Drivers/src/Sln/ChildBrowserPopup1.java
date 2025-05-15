package Sln;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent_id=driver.getWindowHandle();
		System.out.println(parent_id);
		//print parent id of a browser

	}

}
