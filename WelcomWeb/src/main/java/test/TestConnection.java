package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		System.out.println("Connection Established");

		
	}
	
}
