package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	
		FileInputStream fi = new FileInputStream("D:/Practice/1.xlsx");
		Workbook w= WorkbookFactory.create(fi);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.getRow(2);
		Cell c = r.getCell(0);
		String val = c.getStringCellValue();
		System.out.println(val);
	}

}
