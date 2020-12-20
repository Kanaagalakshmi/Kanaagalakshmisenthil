import java.sql.*;
public class ConnectionClass {
Connection con;

Connection connectionFactory() {
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_database","root","Lordshiva6@");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
