package prepareStatementupdate;
import java.sql.*;
public class UpdatePrepareStatement{

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
			
			String query="update employee set e_id=? where e_id=?";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, 10);
			ps.setInt(2, 12);
			
			int updated =ps.executeUpdate();
			System.out.println(updated+"rows updated");
			String query1="select * from employee";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query1);
			while(rs.next()) {
				int id=rs.getInt(1);
				System.out.println(id);
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
