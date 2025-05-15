package Practice;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElementByXPath("//a[.='English (UK)']");
		String title=ele.getAttribute("title");
		System.out.println(title);
		String URL = ele.getAttribute("href");
		System.out.println(URL);
		String text=ele.getText();
		System.out.println(text);
		Point p=ele.getLocation();
		System.out.println(p);
		int x=p.getX();
		System.out.println(x);
		int y = p.getY();
		System.out.println(y);
		
		
		
		

	}

}
