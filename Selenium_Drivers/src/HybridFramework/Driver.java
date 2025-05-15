package HybridFramework;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String path="D://Hybrid.xlsx";
      ExcelUtils.SetExcelFile(path, "Sheet1");
      
      
      for(int row=1; row<=6; row++)
      {
    	  String Key = ExcelUtils.GetCellData(row, 0);
    	  
    	  if(Key.equals("OpenBrowser"))
    	  {
    		  Keywords.OpenBrowser();
    	  }
    	  
    	  else if(Key.equals("Navigate"))
    	  {
    		  Keywords.Navigate();
    	  }

    	  else if(Key.equals("Email"))
    	  {
    		  Keywords.Email();
    	  }
    	  else if(Key.equals("Password"))
    	  {
    		  Keywords.Password();
    	  }
    	  
    	  else if(Key.equals("Login"))
    	  {
    		  Keywords.Login();
    	  }

    	 /* else if(Key.equals("CloseBrowser"))
    	  {
    		  Keywords.CloseBroswer();
    	  }*/


    	  
      }

	}

}
