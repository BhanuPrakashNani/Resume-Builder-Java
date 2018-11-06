import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NotSignedUp {
	public  boolean database(String username,String password) {
	      try {
	         // Step 1: Allocate a database 'Connection' object
	         Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/resume", "root", "bhanu");
	               // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	 
	         // Step 2: Allocate a 'Statement' object in the Connection
	         Statement stmt = conn.createStatement();
	         String strSelect = "select * from signup where username = '"+username+"'AND password ='"+password+"'";
	         ResultSet r = stmt.executeQuery(strSelect);
	         
	         if(r.next()) {
	        	 return true;
	         }
	      }
	      
	      catch (SQLException e){
	    	  e.printStackTrace();
	      }
		return false;
	}

}
