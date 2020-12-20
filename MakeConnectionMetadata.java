package JDBCDemo;
import java.sql.*;
import java.io.*;

public class MakeConnectionMetadata {
Connection conn;
Statement stmt;
String s1,s2;
DatabaseMetaData dbmd;
MakeConnectionMetadata(){
	try {
		Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_database","root","Lordshiva6@");
		dbmd=myconn.getMetaData();
		s1=dbmd.getURL();
		s2=dbmd.getSQLKeywords();
		boolean b1=dbmd.supportsTransactions();
		boolean b2=dbmd.supportsSelectForUpdate();
		System.out.println("URL :"+s1);
		System.out.println("SQL Keywords :"+s2);
		System.out.println("This supports Transactions : "+b1);
		System.out.println("This supports SelectForUpdate :"+b2);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
