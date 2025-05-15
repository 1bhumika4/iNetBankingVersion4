package Automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = DriverManager.getConnection("jdbc:sqlserver:thin:@MSSQLLocalDB");
		
		Statement stmt = con.createStatement();
		
		String s = "insert into Customer values('Banu', 'Desc')";
				
		stmt.executeQuery(s);
		
		
		//jdbc:sqlserver:// 
			
			//jdbc:sqlserver://localhost;encrypt=true;user=MyUserName;password=<password>;
		
		//,"hr","hr"
				
			//	jdbc:sqlserver://localhost;encrypt=true;user=MyUserName;password=<password>;

	}

}
