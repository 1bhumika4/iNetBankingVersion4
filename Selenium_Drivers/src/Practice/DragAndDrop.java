package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement ele1 = driver.findElement(By.xpath("(//div[.='Washington'])[2]"));
		WebElement ele2 = driver.findElement(By.xpath("//div[.='United States']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();

	}

}
