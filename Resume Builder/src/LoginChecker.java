import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginChecker {
	public static void main(String[] args) {
	      try {
	         // Step 1: Allocate a database 'Connection' object
	         Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/resume", "root", "bhanu");
	               // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	 
	         // Step 2: Allocate a 'Statement' object in the Connection
	         Statement stmt = conn.createStatement();
	      }
	      
	      catch (SQLException e){
	    	  e.printStackTrace();
	      }
	}
}
