package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleStatement_Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		System.out.println("Connection Established");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getInt(4));
			System.out.println();
		}
		
	}

}
