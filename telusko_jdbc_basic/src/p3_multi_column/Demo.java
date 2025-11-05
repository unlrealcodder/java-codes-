package p3_multi_column;

import java.sql.*;

public class Demo{
	public static void main(String[] args) {
		try {
			Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int columnCount =rsmd.getColumnCount();
			
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			
			System.out.println();
			
			while(rs.next()) {
				for(int i=1;i<=columnCount;i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
			
			
			
		}catch(java.lang.Exception e) {
			e.printStackTrace();
		}
	}
}