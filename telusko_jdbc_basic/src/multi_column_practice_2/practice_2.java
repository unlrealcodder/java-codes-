package multi_column_practice_2;
import java.sql.*;
public class practice_2{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		ResultSetMetaData meta=rs.getMetaData();
		int columnCount=meta.getColumnCount();
		System.out.println("==".repeat(65));
		for(int i=1;i<=columnCount;i++) {
			System.out.printf("%-30s",meta.getColumnName(i));
		}
		System.out.println();
		System.out.println("==".repeat(65));
		
		
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.printf("%-30s",rs.getString(i));
			}
			System.out.println();
			System.out.println("--".repeat(65));
		}
	}
}
