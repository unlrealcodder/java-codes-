package p10;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String str="maheshm";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					char repeated =str.charAt(i);
					System.out.println("first repeated char is -> "+repeated);
					return;
				}
			}
			System.out.println("not found");
		}

	}

}
