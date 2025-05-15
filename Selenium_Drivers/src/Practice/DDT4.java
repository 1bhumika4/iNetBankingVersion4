package Practice;

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

public class DDT4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi = new FileInputStream("D:/Practice/4.xlsx");
		Workbook w = WorkbookFactory.create(fi);
		Sheet sh = w.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> links= driver.findElementsByTagName("a");
		for(int i =0;i<links.size();i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(links.get(i).getAttribute("href"));
			
		}
		
		FileOutputStream fo = new FileOutputStream("D:/Practice/4.xlsx");
		w.write(fo);
	
		

	}

}
