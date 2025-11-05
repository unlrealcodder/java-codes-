package adv_java_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String user;
		String pass;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company1?user=root&password=aanand@M29");
		
		
	user=sc.next();
		pass=sc.next();
		
		String query="insert into login values('"+user+"','"+pass+"')";
		System.out.println(query);
		Statement st=con.createStatement();
		int result=st.executeUpdate(query);
		
		if(result>0) {
			System.out.println("data stored");
		}
		else {
			System.out.println("data failed to store");
		}
		
		con.close();
	}
}