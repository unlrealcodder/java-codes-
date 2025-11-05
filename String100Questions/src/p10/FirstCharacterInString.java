package p10;

public class FirstCharacterInString {

	public static void main(String[] args) {
		String str="mahesh";
		if(str.length()>0) {
			char firstChar=str.charAt(0);
			System.out.println(firstChar);
		}
		else {
			System.out.println("string is empty");
		}

	}

}
