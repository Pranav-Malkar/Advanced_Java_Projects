package app_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Emp_SalRange {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		PreparedStatement ps=con.prepareStatement("select * from emp where sal between ? and ?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter min range of Salary");
		int min=Integer.parseInt(br.readLine());
		System.out.println("Enter max range of Salary");
		int max=Integer.parseInt(br.readLine());
		ps.setInt(1,min);
		ps.setInt(2, max);
		
		
		
	
		
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+":"+rs.getString(2));
		}

	}

}
