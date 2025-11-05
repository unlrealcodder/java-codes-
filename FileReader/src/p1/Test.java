package p1;

import java.io.FileReader;

public class Test{
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("data.txt")){
			int ch;
			
			while((ch=fr.read()) !=-1) {
				System.out.println((char)ch); // char is int we cast it to char
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}

//it means when char read from the file then 
//that chars aschii code which is integer form stored
//in variable char and then we by casting that
//int aschii code is converted to the char and 
//then printed