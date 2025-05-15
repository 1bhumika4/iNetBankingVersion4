package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationType1 {
	
	//Identifiying all the webElements using By
//driver.findElement(By.id("a3")).sendKeys("bhumika");
	
	WebDriver driver;
	
	By FirstName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By SurName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By Email = By.xpath("//*[@id=\"eid\"]/input");
	
	By Phone = By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input");
	
	//*[@id="basicBootstrapForm"]/div[5]/div/label[2]/input
	By Gender = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	By Hobbies1 = By.id("checkbox1");
	By Hobbies2 = By.id("checkbox2");
	//By Languages = By.xpath("//*[@id=\"msdd\"]");
	
	By Skills = By.id("Skills");
	By Countries = By.id("countries");
	
	By Year = By.id("yearbox");
	By Month = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By Day = By.id("daybox");
	
	By Password = By.id("firstpassword");
	By ConfirmPassword = By.id("secondpassword");
	
	By refresh = By.id("Button1");
	
	
	//Constructor creation//
	
	RegistrationType1(WebDriver d)
	{
		
		driver = d;
		
	}
	

	//Create methods for the operations on the above method//
	
	public void SetFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void SetLastName(String lname)
	{
	driver.findElement(SurName).sendKeys(lname);
	}
	
	public void SetAddress(String address)
	{
		driver.findElement(Address).sendKeys(address);
	}
	
	public void SetEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	
	public void SetPhone(String pno)
	{
		driver.findElement(Phone).sendKeys(pno);
	}
	
	public void SetGender()
	{
		driver.findElement(Gender).click();
	}
	
	public void SetHobbies()
	{
		driver.findElement(Hobbies1).click();
		driver.findElement(Hobbies2).click();
	}
	
	
	
	/*
	 * public void SetLanguage(String lang) {
	 * driver.findElement(Languages).sendKeys(lang); }
	 */
	
	public void SetSkills(String skill)
	{
		WebElement skl = driver.findElement(Skills);
		Select sdrop = new Select(skl);
		sdrop.selectByVisibleText(skill);
		
	}
	
	public void SetCountries(String con)
	{
		WebElement country = driver.findElement(Countries);
		Select cdrop = new Select(country);
		cdrop.selectByVisibleText(con);
	}
	
	
	public void SetYear(String year)
	{
		WebElement syear = driver.findElement(Year);
		Select ydrop = new Select(syear);
		ydrop.selectByVisibleText(year);
	}
	
	public void SetMonths(String mon)
	{
		WebElement smon = driver.findElement(Month);
		Select mdrop = new Select(smon);
		mdrop.selectByVisibleText(mon);;
				
	}
	
	
	public void SetDays(String day)
	{
		WebElement dy = driver.findElement(Day);
		Select ddrop = new Select(dy);
		ddrop.selectByVisibleText(day);
	}
	
	public void SetPassword(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void SetCPassword(String cpass)
	{
		driver.findElement(ConfirmPassword).sendKeys(cpass);
	}
	
	public void SetRefresh()
	{
		driver.findElement(refresh).click();
	}
	
	
	
	

    
	
	
	
	
	
	
	

}
