package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/*FileInputStream file = new FileInputStream("C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/Excel files/Data1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i =0;i<=rowcount; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j=0; j<colcount; j++)
			{
				String value = currentrow.getCell(j).toString();
				System.out.print(" "+value);
			}
			
			System.out.println();
		}
		*/
		
		FileInputStream file = new FileInputStream("C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/Excel files/Data1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowcount; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
			for(int j=0;j<colcount; j++)
			{
				String value = currentrow.getCell(j).toString();
				System.out.print(" "+value);
			}
			
			System.out.println();
		}
		

	}

}
