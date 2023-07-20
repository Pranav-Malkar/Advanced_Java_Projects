package app_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Show_Emp_Details {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		PreparedStatement ps=con.prepareStatement("select * from emp where empno=?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Empno of Employee");
		int empno=Integer.parseInt(br.readLine());
		ps.setInt(1,empno);
		
		
		//ps.setInt(1, 7839);
		
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			
			
		}
		else
		{
			System.out.println("Employee does not exist");
		}
		
		
		
	}
		
		
	}


