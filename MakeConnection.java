package JDBCDemo;
import java.sql.*;
public class MakeConnection {
Connection con;
Statement stmt;
ResultSet rs;
MakeConnection(){
	try {
		Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_database","root","Lordshiva6@");
	stmt=myconn.createStatement();
	rs=stmt.executeQuery("Select age,id from customers");
	while(rs.next()) {
		System.out.println(rs.getString(1)+" "+rs.getInt(2));
		
	}
	myconn.close();
	
	}
	catch(SQLException e) {
		System.out.println(e);
	}
	
}
}
