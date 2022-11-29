package corejava_package;
import java.sql.*;
import java.util.Properties;


public class jdbcprog2 {

	
	
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con =
	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprog2","root","@Kshatha123");
	String url = "jdbc:mysql://localhost:3306/jdbcprog2";
	Properties p= new Properties();
	p.put("user", "root");
	p.put("password", "@Kshatha123");
	Connection con = DriverManager.getConnection(url, p);
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root", "@Kshatha123");
	Statement st = con.createStatement();
	String query1 = "create table student1( studentId int primary key, studentName varchar(20), studentMarks int)";
	int i = st.executeUpdate(query1);
	int j = st.executeUpdate("create table student1(studentId int primary key,studentName varchar(20), studentMarks int");
	System.out.println("No of rows affected: " +i);//0
	System.out.println("No of rows affected: " +j);//0
	System.out.println("Table created Sucessfully");
	st.close();//comminication
	con.close();//connection
	}
	}
	

