package Automation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream file = new FileOutputStream("C:/Users/Bhumika/eclipse-workspace/Selenium_Drivers/Excel files/Data3.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet1 = book.createSheet("Data");
		
		for(int i =0; i<=5; i++)
		{
			XSSFRow row = sheet1.createRow(i);
			
			for(int j=0; j<3;j++)
			{
				row.createCell(j).setCellValue("abc");
			}
		}
		
		book.write(file);
		file.close();
		
		System.out.println("Data written to excel");
		
		
		

	}

}
