package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file = new FileInputStream("C://Users//Bhumika//eclipse-workspace//Selenium_Drivers//Excel files/Data1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1"); //providing sheet name
		
		int rowcount = sheet.getLastRowNum(); // returns the rowcount
		int colcount = sheet.getRow(0).getLastCellNum(); // return the column or cell count
		
		
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i); //focussed on current row
			
			for(int j=0;j<colcount; j++)
			{
				String value = currentrow.getCell(j).toString();  //read the va;ue from the cell
				System.out.print("  "+value);
			}
			
			
			System.out.println("   ");
		}
		
		
		

	}

}
