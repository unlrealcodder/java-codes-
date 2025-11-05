package p4throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test{
	public static void main(String[] args) {
	
		
		
		
		
		try {
			method1();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
		}
		
		
	}
	
	public static void method1() throws FileNotFoundException{
		FileReader filread=new FileReader("a.txt");
	}
	
	
	
	
}