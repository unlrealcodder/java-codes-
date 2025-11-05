package multi_column_p4;
import java.sql.*;

public class Demo1{
	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		ResultSetMetaData rsmd=rs.getMetaData();
		int columnCount=rsmd.getColumnCount();
		System.out.println("=".repeat(100));
		for(int i=1;i<=columnCount;i++) {
			System.out.printf("%-20s",rsmd.getColumnName(i));
		}
		System.out.println();
		System.out.println("=".repeat(100));
		
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.printf("%-20s",rs.getString(i));
			}
			System.out.println();
			System.out.println("-".repeat(100));
		}
		
		
		
		
		rs.close();
		st.close();
		con.close();
		
	}
	
	
}