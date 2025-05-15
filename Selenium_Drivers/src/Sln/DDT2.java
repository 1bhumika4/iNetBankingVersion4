package Sln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("D://Doc1.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.createRow(6);
		Cell c= r.createCell(0);
		c.setCellValue("Bhumika");
		FileOutputStream fo=new FileOutputStream("D://Doc1.xlsx");
		wb.write(fo);
	
		
	/*	FileInputStream fi=new FileInputStream("D://Doc1.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.createRow(5);
		Cell c=r.createCell(0);
		c.setCellValue("bhumi");
		FileOutputStream fo=new FileOutputStream("D://Doc1.xlsx");
		wb.write(fo);*/

	}

}
