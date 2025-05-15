package Sln;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteData("Sheet1",1,1,"bhumi");

	}
	
	public static void WriteData(String sheet,int row, int cell, String data)
	{
		try
		{
		FileInputStream fi=new FileInputStream("D://Doc3.xlsx");
		Workbook wb= WorkbookFactory.create(fi);
		wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fo=new FileOutputStream("D://Doc3.xlsx");
		wb.write(fo);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}

}
