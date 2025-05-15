package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	
	
//Declaration
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	//Initialization
	
	public POM3(ChromeDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	//Utilization
	
	public void sendEmail(String E)
	{
		email.sendKeys(E);
	}
	
	public void sendPassword(String P)
	{
		pass.sendKeys(P);
	}
	
	public void loginclk()
	{
		login.click();
	}

}
