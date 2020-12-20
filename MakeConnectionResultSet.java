package JDBCDemo;
import java.sql.*;

public class MakeConnectionResultSet {
	Connection con;
	Statement stmt;
	ResultSet rs;
	ResultSetMetaData rsmd;
	MakeConnectionResultSet(){
		try {
			Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_database","root","Lordshiva6@");
		stmt=myconn.createStatement();
		rs=stmt.executeQuery("Select * from customers");
		rsmd=rs.getMetaData();
		int noc=rsmd.getColumnCount();
		System.out.println("Numeber of columns :"+noc);
		for(int i=1;i<=noc;i++) {
			System.out.println("Column "+i+" ="+rsmd.getColumnName(i));
			System.out.println("Column Type "+i+" ="+rsmd.getColumnType(i));
			System.out.println("Column Type Name"+i+" ="+rsmd.getColumnTypeName(i));
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	}


