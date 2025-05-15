package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
	FileInputStream fi = new FileInputStream("D:/Practice/1.xlsx");
	Workbook w = WorkbookFactory.create(fi);
	Sheet sh = w.getSheet("sheet1");
	int count = sh.getLastRowNum()- sh.getFirstRowNum();
	for(int i =0; i<=count; i++)
	{
		Row r = sh.getRow(i);
		for(int j=0;j<r.getLastCellNum(); j++)
		{
			String val =r.getCell(j).getStringCellValue();
			System.out.println(val);
			
		}
	}

	}

}
