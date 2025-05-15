package Sln;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8904907746");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("siddappajihowdu");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		
		driver.findElement(By.xpath("//input[@id='email' and @type='text']")).sendKeys("8904907746");
		driver.findElement(By.xpath("//input[@name='pass' and @type='password']")).sendKeys("siddappajihowdu");
		driver.findElement(By.xpath("//button[@type='submit' and @value='1']")).click();
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		driver.get("D://table.html");
		//should highlight java in the table
				driver.findElement(By.xpath("//td[text()='java']"));
				
				//should highlight java in the table		
				driver.findElement(By.xpath("//td[.='java']"));
				
				driver.findElement(By.xpath("//td[.='java' | @id='a2']")); //no o/p
				
				//dynamic elements using contains tag
				driver.findElement(By.xpath("//td[contains(text(),'java')]"));
				
				driver.findElement(By.xpath("//td[contains(.,'java')]"));
				
				//&nbsp tag
				driver.findElement(By.xpath("//span[text(),'Asia']"));
				
				//Traversing
				driver.get("D://traversing.html");
				driver.findElement(By.xpath("//td[text()='KGF'] /.. /td[3]"));
				
			driver.findElement(By.xpath("//td[text()='KGF'] /.. td[3]"));
			
			//sibling functions
				driver.findElement(By.xpath("//td[text()='Robert'] /following-sibling :: td[1]"));
				driver.findElement(By.xpath("//td[text()='KGF'] /preceding-sibling' :: td[1]"));
				
				//Ancestor assignment: ancestor webpage
				
				//a>66
				//td[.='A'] /following-sibling :: td[1]
				
				//B>99
				//td[.='B'] /following-sibling:: td[1]
				
				//B>3
				//td[.='B'] /.. /following-sibling  :: tr[1]/td[1]
				
				
				//c>1
				//td[.='C'] /.. /preceding-sibling :: tr[2] / td[1]
				
				//a>33
				//td[.='A'] /.. /following-sibling :: tr[2] / td[3]
				
				//B>66
				//td[.='B'] /.. /preceding-sibling :: tr[1]/td[3]
				
				//c>2
				//td[.='C'] /.. /preceding-sibling :: tr[1]/td[1]
				
				//a>3
				//td[.='A'] /.. /following-sibling :: tr[2]/td[1]
				
			
				//B>33				
				//td[.='B'] /.. /following-sibling :: tr[1]/td[3]
				
				
				//c>a
				//td[.='C'] /.. /preceding-sibling :: tr[2]/td[2]
				
				//a>b>c
				//td[.='A'] /.. /following-sibling :: tr[1]/td[2] /.. /following-sibling :: tr[1]/td[2]
				
				//B>1>99>B
				//td[.='B'] /.. /preceding-sibling :: tr[1]/td[1] /.. /following-sibling :: tr[1]/td[3] /preceding-sibling :: td[1]
				
				//c>2>3>1
				//td[.='C'] /.. /preceding-sibling :: tr[1]/td[1] /.. /following-sibling :: tr[1]/td[1] /.. /preceding-sibling :: tr[2]/td[1]
				
				//a>c>b>a
				//td[.='A'] /.. /following-sibling:: tr[2]/td[2] /.. /preceding-sibling :: tr[1]/td[2] /.. /preceding-sibling :: tr[1]/td[2]
				
				
				
				//xpath by grouped index: Index webpage
				
				//A
				//div[1]/input[1]
				
				//B
				//div[1]/input[2]
				
				//C
				//div[2]/input[1]   or(//input[1])[2]
				
				//D
				//div[2]/input[2]
				
				
				//popup-menu
				
				//popup-menu webpage
				/*
				(//span[text()='Login'])[2]  */
				
				
				
				
		
		
		
		
		
		
		
		//td[.='Robert'] /preceding-sibling :: td[1]
		
		
		
		
		
		
		
		

	}

}
