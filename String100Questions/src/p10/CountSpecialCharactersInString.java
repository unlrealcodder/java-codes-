package p10;

public class CountSpecialCharactersInString {

	public static void main(String[] args) {
		String name="&ma/he*sh";
		int specialCount=0;
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(!(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))) {
				System.out.println(ch);
				specialCount++;
			}
		}
        System.out.println("total special characters in string are "+specialCount);
	}

}
