package Sln;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	
	//Declaration
	
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement LoginBtn;
	
	//Initialization
	
	public POM3(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void setUN(String UN)
	{
		email.sendKeys(UN);
	}
	
	public void setPWD(String PWD)
	{
		password.sendKeys(PWD);
}
	
	public void LoginClk()
	{
		LoginBtn.click();
	}

}
