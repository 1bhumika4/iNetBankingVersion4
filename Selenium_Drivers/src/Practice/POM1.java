package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	//Declaration
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	//Initialization
	
	public POM1(ChromeDriver driver)
	{
		PageFactory.initElements( driver, this);
	}

	
	//Utilization
	
	public void login()
	{
		loginbtn.click();
	}
}
