package p2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo{
	public static void main(String[] args) {
	
		try {
			Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
			Statement st=con.createStatement();
			ResultSet result=st.executeQuery("select * from employee");
			
			if(result.next()) {
				String name=result.getString(1);
				System.out.println(name);
			}
			
			con.close();
			st.close();
			result.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


