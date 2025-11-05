package p10;

public class RemoveWhiteSpaceinString {

	public static void main(String[] args) {
		String name="mahesh vilas chikhale";
		char[]arr=name.toCharArray();
		String reverse="";
		for(int i=0;i<name.length();i++) {
			if(!Character.isWhitespace(arr[i])) {
				reverse+=arr[i];
			}
		}
		System.out.println("string without space -> "+reverse);
		

	}

}
