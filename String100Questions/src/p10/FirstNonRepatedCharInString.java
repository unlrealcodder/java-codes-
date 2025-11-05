package p10;

public class FirstNonRepatedCharInString {

	public static void main(String[] args) {
		String name="aabbbccdggj";
		char[]arr=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			boolean isRepeated=false;
			
			for(int j=0;j<name.length();j++) {
				if(i!=j&&name.charAt(i)==name.charAt(j)) {
					isRepeated=true;
					break;
					
				}
			}
			if(!isRepeated) {
				System.out.println("first nonrepeated char is -> "+name.charAt(i));
				return;
			}
		}
		System.out.println("not found");
	}

}
