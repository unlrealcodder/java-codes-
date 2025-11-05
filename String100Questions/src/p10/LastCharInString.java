package p10;

public class LastCharInString {

	public static void main(String[] args) {
		String str="mahesh";
		int n=str.length()-1;
		
		if(str.length()>0) {
			char lastChar=str.charAt(n);
			System.out.println(lastChar);
		}
		else {
			System.out.println("string is empty");
		}

	}

}
