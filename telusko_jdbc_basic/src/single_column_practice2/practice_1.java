package single_column_practice2;
import java.sql.*;
public class practice_1{
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=aanand@M29");
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery("select * from employee");
			
			//printing data without using resultsetmeta data to print multiple column
			System.out.println("\n"+"==".repeat(50));
			System.out.printf("%-5s %-20s %-20s %-20s ","id","name","email","salary");
			System.out.println("\n"+"==".repeat(50));
			while(result.next()) {
				
				
				

				// for id
				int id=result.getInt(1);
				System.out.printf("\n"+"%-5s",id);
				
				
				// for name
				
				String name=result.getString(2);
				System.out.printf("%-20s",name);
				
				//for email
				String email=result.getString(3);
				System.out.printf("%-20s",email);
				
				// for salary
				double salary=result.getDouble(4);
				System.out.printf("%-20s",salary);
				System.out.println("\n"+"--".repeat(50));
			}
			
			
			
			
		}catch(Exception e) {
			
		}
	}
}