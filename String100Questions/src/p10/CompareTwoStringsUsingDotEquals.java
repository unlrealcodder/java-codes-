package p10;

public class CompareTwoStringsUsingDotEquals {

	public static void main(String[] args) {
		String str1="mahesh";
		String str2="mahesh";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println();
		
		String str3="vilas";
		String str4=new String("vilas");
		
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		System.out.println();
		
		String str5=new String("sumit");
		String str6=new String("sumit");
		
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
		

	}

}
