package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		PreparedStatement ps=con.prepareStatement("update emp set sal=? where empno=?");
		
		ps.setFloat(1, 10000);
		ps.setInt(2, 7499);
		
		int n=ps.executeUpdate();
		System.out.println(n);

	}

}
