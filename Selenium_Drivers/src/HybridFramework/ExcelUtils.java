package HybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	static Workbook wb;
	static Sheet sh;
	
	public static void SetExcelFile(String path, String SheetName) throws IOException
	{
		FileInputStream fs=new FileInputStream(path);
		wb=WorkbookFactory.create(fs);
		sh=wb.getSheet(SheetName);
	}
	
	public static String GetCellData(int row, int col)
	{
       Cell cell=sh.getRow(row).getCell(col);
       String val=cell.getStringCellValue();
       return val;
	}

}
