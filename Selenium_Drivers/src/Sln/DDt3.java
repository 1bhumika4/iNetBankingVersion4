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

public class DDt3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream("D://Doc1.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet("Sheet1");
		int count=sh.getLastRowNum()-sh.getFirstRowNum();
		for(int i=0;i<=count;i++)
		{
			Row r=sh.getRow(i);
			
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String val=c.getStringCellValue();
				System.out.println(val);
			}
		}
		

	}

}
