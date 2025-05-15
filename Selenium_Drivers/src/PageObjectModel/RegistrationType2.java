package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationType2 {
	
	
	WebDriver driver;
	
	//Syntax//
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	WebElement FirstName;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")	
	WebElement LastName;
	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
	
	WebElement Address;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"eid\"]/input")
	WebElement Email;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement Phone;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")
	WebElement Gender;
	
	@FindBy(how=How.ID, using = "checkbox1")
	WebElement Hobby1;
	
	@FindBy(how=How.ID, using="checkbox2")
	WebElement Hobby2;
	
	@FindBy(id="Skills")
	WebElement Skills;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")
	WebElement Country;
	
	@FindBy(id="yearbox")
	WebElement Years;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
	WebElement Months;
	
	@FindBy(id="daybox")
	WebElement Days;
	
	@FindBy(how=How.ID, using = "firstpassword")
	WebElement Password;
	
	@FindBy(how=How.ID, using="secondpassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="Button1")
	WebElement Refresh;
	
	//Constructor creation
	
	RegistrationType2(WebDriver d)
	{
		
		driver = d;
		PageFactory.initElements(d,this);
	}
	
	
	public void SetFirstName(String fname)
	{
		FirstName.sendKeys(fname);
		//FirstName.sendKeys(fname);;
	}
	
	
	
	public void SetLastName(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void SetAddress(String address)
	{
		Address.sendKeys(address);
	}
	
	public void SetEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	
	public void SetPhone(String phone)
	{
		Phone.sendKeys(phone);
	}
	
	public void SetGender()
	{
		Gender.click();
	}
	
	
	public void SetHobbies()
	{
		Hobby1.click();
		Hobby2.click();
	}
	
	public void SetSkills(String skill)
	{
		WebElement ssdrop = Skills;
		Select skl = new Select(ssdrop);
		skl.selectByVisibleText(skill);
		
		
		
	}
	
	
	public void SetCountry (int con)
	{
		WebElement country = Country;
		Select cdrop = new Select(country);
		cdrop.selectByIndex(con);
		
		
	}
	
	
	public void SetYear(String year)
	{
		WebElement ydrop = Years;
		Select y = new Select(ydrop);
		y.selectByVisibleText(year);
	}
	
	public void SetMonths(String month)
	{
		WebElement mdrop = Months;
		Select m = new Select(mdrop);
		m.selectByVisibleText(month);
	}
	
	public void SetDays(String day)
	{
		WebElement ddrop =Days;
		Select d = new Select(ddrop);
		d.selectByVisibleText(day);
	
	}
	
	public void SetPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void SetConfirmPassword(String cpass)
	
	{
		ConfirmPassword.sendKeys(cpass);
	}
	
	public void SetRefresh()
	{
		Refresh.click();
	}
	
	
	
	
	
	
	
	
	
	
}
