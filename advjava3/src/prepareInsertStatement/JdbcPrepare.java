package prepareInsertStatement;
import java.sql.*;
public class JdbcPrepare{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
		String query="insert into employee values(?,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, 12);
		ps.setString(2, "seema");
		ps.setString(3, "seema@gmail.com");
		ps.setDouble(4, 3000);
		ps.setInt(5, 101);
		
		
		
		int rows=ps.executeUpdate();
		System.out.println(rows+"records(s) inserted.");
		
		
		//qyery 2
		
		
		
		con.close();
	}
}