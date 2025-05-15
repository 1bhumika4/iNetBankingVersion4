package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByCssSelector("input[name='email']").sendKeys("bhumika.r.h@gmail.com");
		driver.findElementByCssSelector("input[name='pass']").sendKeys("Alliswell@145");
		driver.findElementByCssSelector("button[name='login']").click();

	}

}
