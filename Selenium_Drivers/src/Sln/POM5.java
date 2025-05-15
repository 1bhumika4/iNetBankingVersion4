package Sln;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM5 {
	
	//Declaration
	
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	
	//Initialization
	
	public POM5(ChromeDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	//Utilization
	
	public void SetEmail(String E)
	{
	 email.sendKeys(E);
	}
	
	public void SetPassword(String p)
	
	{
		password.sendKeys(p);
	}
	
	public void Login()
	{
		login.click();
	}
}
