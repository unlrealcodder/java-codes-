package p10;

public class AsciiForEachCharInString {

	public static void main(String[] args) {
		String name="maheshA";
		for(int i=0;i<name.length();i++) {
			char ch= name.charAt(i);
			int ascii= (int) ch;
			System.out.println("ascii for character"+" ["+ch+"] "+"is ->"+ascii);
		}

		
	}

}
