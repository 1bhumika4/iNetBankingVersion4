package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Third {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				
				driver.manage().window().maximize();
				driver.findElement(By.name("user-name")).sendKeys("standard_user");
				//driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("secret_sauce");
				driver.findElement(By.name("login-button")).click();
				
				
				String expTitle = driver.getTitle();
				String actTitle = "Swag Labs";
				
				if(expTitle.equals(actTitle))
					
				{
					System.out.println("Test case is passed");
				}
				
				else
					
				{
					System.out.println("Test case is failed");
				}
				
				
			driver.close();

			}

		}

		
		
		
		
		
		
		
		