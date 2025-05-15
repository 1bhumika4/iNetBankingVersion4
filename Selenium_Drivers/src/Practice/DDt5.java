package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDt5 {
	
	
	public static String GetData(String Sheet, int Row, int Cell)
	{
		String val = "";
		try
		{
			FileInputStream fi = new FileInputStream("D:/Practice/5.xlsx");
			Workbook w = WorkbookFactory.create(fi);
			Cell c = w.getSheet(Sheet).getRow(Row).getCell(Cell);
			val = c.getStringCellValue();
			System.out.println(val);
			
		}
		
		
		
		catch(Exception e)
		{
			System.out.println("Unable to fetch data");
		}
		
		return val;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetData("Sheet1",2,0);
			
		
		
		

	}

}
