package JDBCDemo;
import java.sql.*;
public class Driverdemo {
public static void main(String[]args) throws Exception 
{
	//	Class.forName("com.mysql.jdbc.Driver");
		//1.get a connection to database
		Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_database","root","Lordshiva6@");
		
		
		//2.create a statement
		Statement myStmt=myconn.createStatement();
		//3.execute sql query
		ResultSet myRs=myStmt.executeQuery("select  * from CUSTOMERS");
		//4.process the result set
		while(myRs.next()) {
			System.out.println(myRs.getString("ID"));
		}
		
	
}
}
