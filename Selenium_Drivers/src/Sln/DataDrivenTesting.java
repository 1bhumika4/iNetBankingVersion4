package Sln;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDrivenTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("D://Doc1.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c=r.getCell(0);
		String val=c.getStringCellValue();
		System.out.println(val);
		
		

	}

}
