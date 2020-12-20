import java.sql.*;

public class JdbcCalls {
Connection con;
JdbcCalls(){
	ConnectionClass x=new ConnectionClass();
	con=x.connectionFactory();
}
void create()throws SQLException
{
	String tablename="demotable";
//	PreparedStatement pst=con.prepareStatement("Create table"+tablename+"(empid number(4),empname varchar(20),dept varchar2(10),joindate date,salary number(10,2))");
	PreparedStatement pst=con.prepareStatement("UPDATE CUSTOMERS SET NAME=? WHERE ID=?");

pst.setString(1, "kanaagalakshmi s");
pst.setInt(2, 1);
pst.executeUpdate();


System.out.println("Table created successfully");
}
}
