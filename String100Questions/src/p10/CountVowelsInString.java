package p10;

public class CountVowelsInString {

	public static void main(String[] args) {
		
		String name ="mahesh vilas chikhale";
		char[]name1=name.toCharArray();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name1[i]=='a'|| name1[i]=='e'|| name1[i]=='i'|| name1[i]=='o'|| name1[i]=='u') {
				count++;
				System.out.println(name1[i]+"->"+count+"th"+"vowel");
			}
		}
		System.out.println("vowels count is "+count);

	}

}
