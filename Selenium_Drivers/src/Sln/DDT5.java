package Sln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		getData("Sheet1",0,0);
		
		
		
}
	
	public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		String val="";
	
		try {
			FileInputStream fs = new FileInputStream("D://Doc3.xlsx");
			Workbook wb=WorkbookFactory.create(fs);
			
			System.out.println(wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue());
			//Sheet sh=wb.getSheet(sheet);
			//Row r=sh.getRow(row);
			//Cell c=r.getCell(cell);
			//val=c.getStringCellValue();
			//System.out.println(val);
		}
		
		 catch (Exception e) {
			// TODO Auto-generated catch block
          System.out.println("Unable to fetch data");
		}
		
		
		return val;
		
	}
	

}
