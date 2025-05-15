package Sln;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	//declaration
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//Intialization
	
	public POM1 (ChromeDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void ClickLogin()
	{
		loginbtn.click();
	}
	
	
	

}
