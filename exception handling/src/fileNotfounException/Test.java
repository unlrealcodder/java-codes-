package fileNotfounException;

import java.io.FileReader;

public class Test{
	public static void main(String[] args) {
	try {
		FileReader fileread=new FileReader("a.text");
	}
	catch(Exception ce) {
		System.out.println(ce);
	}
	finally {
		System.out.println("always runn");
	}
		
	}
}