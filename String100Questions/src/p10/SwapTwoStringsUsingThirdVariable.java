package p10;

public class SwapTwoStringsUsingThirdVariable {

	public static void main(String[] args) {
		String str1="mahesh";
		String str2="sumit";
		
		
		System.out.println("\nbefore swapping\n");
		System.out.println("str1 -> "+str1);
		System.out.println("str2 -> "+str2);
		
			// in that we are only changing the references
			String temp=str1;
			str1=str2;
			str2=temp;
			
		
		System.out.println("\nafter swapping\n");
		System.out.println("str1 -> "+str1);
		System.out.println("str2 -> "+str2);
	}

}
