package p10;

public class CharAtIndex {

	public static void main(String[] args) {
		String str="abbu";
		int n=0;
		char ch;
		char[]arr=str.toCharArray();
		
			if(n<=str.length()) {
				System.out.println("character at index "+n+" is -> "+str.charAt(n));
			}
			else {
				System.out.println("index not available");
			}
		

		
	}

}
