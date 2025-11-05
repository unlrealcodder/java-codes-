package p1;

import java.io.StringReader;
// it reads character from the string
// it is the subclass of Reader
//stringreader treats string as file 
//stringreader takes string as input
//string reader is faster than filereader
// not need to close source file
public class Test{
	public static void main(String[] args) {
		String str ="mahesh\n vilas\nchikhale";
		
		try (StringReader sr=new StringReader(str)){
		
			int ch;
			while((ch=sr.read())!=-1) {
				System.out.print((char)ch);// casting int -> char
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}