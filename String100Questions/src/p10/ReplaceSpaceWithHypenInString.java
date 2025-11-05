package p10;

public class ReplaceSpaceWithHypenInString {

	public static void main(String[] args) {
		String name="mahesh vilas chikhale";
		
		char[]arr=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if(Character.isWhitespace(arr[i])) {
				arr[i]='-';
			}
		}
		System.out.println(arr);

	}

}
