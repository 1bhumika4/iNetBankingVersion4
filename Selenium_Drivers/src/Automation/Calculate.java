package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://everydaycalculation.com/simple-interest.php");
		driver.manage().window().maximize();
		
		FileInputStream file =new FileInputStream("C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/Excel files/Data2.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=1; i<rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			XSSFCell principle = row.getCell(0);
			int princ = (int) principle.getNumericCellValue();
			
			XSSFCell interest = row.getCell(1);
			int roi = (int) interest.getNumericCellValue();
			
			XSSFCell period = row.getCell(2);
			int per = (int) period.getNumericCellValue();
			
			XSSFCell frequency = row.getCell(3);
			String freq = frequency.getStringCellValue();
			
			XSSFCell maturity = row.getCell(4);
			int exp_value = (int) maturity.getNumericCellValue();
			
			Select SolveFor = new Select(driver.findElement(By.name("solve_for")));
			SolveFor.selectByVisibleText("Simple Interest");
			
			driver.findElement(By.name("p")).sendKeys(String.valueOf(princ));
			
			driver.findElement(By.name("i")).sendKeys(String.valueOf(roi));
			
			Select yearly = new Select(driver.findElement(By.name("iopt")));
			yearly.selectByVisibleText("Yearly");
			
			
			driver.findElement(By.name("t")).sendKeys(String.valueOf(per));
			
			Select years = new Select(driver.findElement(By.name("ts")));
			years.selectByVisibleText("Years");
			
			driver.findElement(By.xpath("//*[@id=\"form1\"]/p[6]/input")).click();
			
			//System.out.ptintln("Maturity value"+exp_value);
			
			
			//String act_value= driver.findElement((By.xpath("//*[@id=\"result\"]/p[2]/b[2]"))).getText();
			
			//System.out.println("Actual value:"+act_value);
			
			/*
			if((Double.parseDouble(act_value))== exp_value)
			{
				System.out.println("Test passed");
			}
			https://math.tools/calculator/interest/simple
			
			
			else
			{
				System.out.println("Test failed");
			}
			
			*/
		
			
		}
		
		
		

	}

}
