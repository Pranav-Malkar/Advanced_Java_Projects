package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_DeptSal_Sort {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dac";
		Connection con = DriverManager.getConnection(url, "root", "root");
		

		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs=st.executeQuery("select deptno,avg(sal) from emp group by deptno order by avg(sal)");
		
		while(rs.next())
		{
			System.out.println(rs.getBoolean(8)+" "+rs.getFloat(6));
		}
		
		

	}

}
