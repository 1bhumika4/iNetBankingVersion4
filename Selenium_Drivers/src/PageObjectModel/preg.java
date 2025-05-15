package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class preg {
	
	//Create a Driver obj
	
	WebDriver driver;
	
	//Store all the WebElements in a variable by locating them via locators
	
	By FirstName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By LastName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By Email = By.xpath("//*[@id=\"eid\"]/input");
	By Phone = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	
	By Gender = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	By Hobby1 = By.id("checkbox1");
	By Hobby2 = By.id("checkbox2");
	
	By Skills = By.id("Skills");
	By Country = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
	
	
	By Years = By.id("yearbox");
	By Months = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By Days = By.id("daybox");
	
	By Password = By.xpath("//*[@id=\"firstpassword\"]");
	By ConfirmPassword = By.xpath("//*[@id=\"secondpassword\"]");
	
	By Refresh = By.id("Button1");
	
	//Create a constructor 
	
	preg(WebDriver d)
	{
		driver = d;
	}
	
	
	//Create methods for actions on the WebElements
	
	public void SetFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	
	public void SetLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void SetAddress(String address)
	{
		driver.findElement(Address).sendKeys(address);
	}
	
	public void SetEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	
	public void SetPhone(String phone)
	{
		driver.findElement(Phone).sendKeys(phone);
	}
	
	public void SetGender()
	{
		driver.findElement(Gender).click();
	}
	
	
	public void SetHobbies()
	{
		driver.findElement(Hobby1).click();
		driver.findElement(Hobby2).click();
	}
	
	public void SetSkills(String skill)
	{
		WebElement ssdrop = driver.findElement(Skills);
		Select skl = new Select(ssdrop);
		skl.selectByVisibleText(skill);
		
		
		
	}
	
	
	public void SetCountry (int con)
	{
		WebElement country = driver.findElement(Country);
		Select cdrop = new Select(country);
		cdrop.selectByIndex(con);
		
		
	}
	
	
	public void SetYear(String year)
	{
		WebElement ydrop = driver.findElement(Years);
		Select y = new Select(ydrop);
		y.selectByVisibleText(year);
	}
	
	public void SetMonths(String month)
	{
		WebElement mdrop = driver.findElement(Months);
		Select m = new Select(mdrop);
		m.selectByVisibleText(month);
	}
	
	public void SetDays(String day)
	{
		WebElement ddrop = driver.findElement(Days);
		Select d = new Select(ddrop);
		d.selectByVisibleText(day);
	
	}
	
	public void SetPassword(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void SetConfirmPassword(String cpass)
	
	{
		driver.findElement(ConfirmPassword).sendKeys(cpass);
	}
	
	public void SetRefresh()
	{
		driver.findElement(Refresh).click();
	}
	
	
	
	
	

}
