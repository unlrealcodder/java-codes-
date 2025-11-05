package advjava3_p1;
import java.sql.*;
public class DmlQuery{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
			Statement st=con.createStatement();
			
			//String query="insert into employee values(9,'vilas','vilas@.com',2500,102)";
			//int rowsAffected=st.executeUpdate(query); 
			
//			if(rowsAffected>0) {
//				System.out.println(rowsAffected + " row(s) inserted successfully!");
//			}
			
			
			ResultSet rs=st.executeQuery("select * from employee");		
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				double salary=rs.getDouble(4);
				int dep_id =rs.getInt(5);
				
				System.out.println(id+"\t"+name+"\t"+email+"\t"+salary+"\t"+dep_id);
			}
			
			con.close();
			
			
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}