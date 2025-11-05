package telusko_jdbc_basic_p1;

//step 1 -> import packages
//This imports all classes and interfaces from java.sql package.
//You can also import specific classes:
import java.sql.*;

 
public class Basic{
	private static final String url="jdbc:mysql://localhost:3306/company";
	private static final String username="root";
	private static final String password="aanand@M29";
	
	public static void main(String[] args) {
		String query=" select e_name from employee where e_id=1 ";
		
		
	
		try {
		
			//step 2 -> loading driver
			
			// load jdbc driver (optional in modern java)
			// write in try block or throws because of classnotfoundexception
			// if we skip the step driver automatically loaded internally
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step 3 -> create the connection
			// connecction is the interface
			// drivermanager class
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//step 4 ->create statement
			//statement is the interface
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			if(rs.next()) {
				String name = rs.getString(1);
                System.out.println(name);
			}
                
            
			
			
			
			rs.close();
            st.close();
			con.close();
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}