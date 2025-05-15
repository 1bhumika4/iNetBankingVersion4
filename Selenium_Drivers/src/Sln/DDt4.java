package Sln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDt4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//for links
		
     /*  FileInputStream fi=new FileInputStream("D://Doc1.xlsx");
       Workbook wb=WorkbookFactory.create(fi);
       Sheet sh=wb.getSheet("Sheet1");
       System.setProperty("webdriver.chrome.driver","./WebDriver/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       List<WebElement> li=driver.findElements(By.xpath("//a"));
       for(int i=0;i<li.size();i++)
       {
    	   Row r=sh.createRow(i);
    	   Cell c=r.createCell(0);
    	   c.setCellValue(li.get(i).getAttribute("href"));
    			   
       }
   
       FileOutputStream fo=new FileOutputStream("D://Doc1.xlsx");
		wb.write(fo);*/
		
		//for image
		
		FileInputStream fs= new FileInputStream("D://Doc2.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		for(int i=0;i<links.size();i++)
		{
		  Row r=sh.createRow(i);
		  Cell c=r.createCell(0);
		  c.setCellValue(links.get(i).getAttribute("src"));
		  
		}
		FileOutputStream fo=new FileOutputStream("D://Doc2.xlsx");
		wb.write(fo);
		
		
		
		
		
		
	}

}
