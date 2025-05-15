package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		WriteData("Sheet1",0,0,"Vibha");
		
		
		
	}
	
	public static void WriteData(String Sheet,int Row, int Cell,String Data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream("D:/Practice/6.xlsx");
		Workbook w = WorkbookFactory.create(fi);
		org.apache.poi.ss.usermodel.Cell c= w.getSheet(Sheet).createRow(Row).createCell(Cell);
		c.setCellValue(Data);
		FileOutputStream fo = new FileOutputStream("D:/Practice/6.xlsx");
		w.write(fo);
		
	}


}
