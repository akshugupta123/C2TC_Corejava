package corejava_package;

import java.sql.Connection;// 1st step import file 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// jdbc statements
//1.import package
//2.load and register driver
//3.establish the connection
//4.create the statement
//5.execute the query
//6.process result
//7.close
public class DemoClass {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//Class.forName("com.mysql.cj.jdbc.Driver");// step 2 class loader
			try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root", "@Kshatha123");
			Statement st = con.createStatement();// step 4 create a statement object
			String query1 = "insert into student values(7,'manu')";
			//String query = "select * from emp1";
			ResultSet rs = st.executeQuery("SELECT * from student");
			while(rs.next())
			{
			System.out.println(rs.getString(1)); //First Column
			System.out.println(rs.getString(2)); //Second Column
			//System.out.println(rs.getString(3)); //Third Column
			}
			st.executeUpdate(query1);
			System.out.println("Student Table created successfully");
			System.out.println("Row inserted successfully");
			st.close();
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
		
	}