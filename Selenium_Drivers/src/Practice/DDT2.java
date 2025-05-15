package Practice;

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
		
		
		FileInputStream fi = new FileInputStream("D:/Practice/2.xlsx");
		Workbook w= WorkbookFactory.create(fi);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.createRow(0);
		Cell c = r.createCell(1);
		c.setCellValue("Bhumi");
		FileOutputStream fo = new FileOutputStream("D:/Practice/2.xlsx");
		w.write(fo);

	}

}
