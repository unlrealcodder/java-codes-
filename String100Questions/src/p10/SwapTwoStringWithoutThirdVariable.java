package p10;

public class SwapTwoStringWithoutThirdVariable {

	public static void main(String[] args) {
		String str1="mahesh";
		String str2="sumit";
		
		
		System.out.println("\nbefore swapping\n");
		System.out.println("str1 -> "+str1);
		System.out.println("str2 -> "+str2);
		
		
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		// it gives str2=mahesh
		
		str1=str1.substring(str2.length());
        // it gives str1=sumit 
		
		System.out.println("\nafter swapping\n");
		System.out.println("str1 -> "+str1);
		System.out.println("str2 -> "+str2);
		
		
	}

}
