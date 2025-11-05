package p10;

public class ConvertStringToInt {

	public static void main(String[] args) {
		//we can use Integer.parseint and Integer.valueof also
		String str="123";
		int num=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			
			int digit= ch-'0';
			num=num*10+digit;
			int temp=num;
			
//			First char '1' → '1' - '0' = 1 → number = 0 * 10 + 1 = 1
//
//					Next char '2' → '2' - '0' = 2 → number = 1 * 10 + 2 = 12
//
//					Next char '3' → 3 → number = 12 * 10 + 3 = 123
		}
		
		System.out.println("converted whole number digit is -> "+num);
		
		
		
		
		
		
		
		
		
		
		
		String str1="1234";
		int digit;
		char[]arr1=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			char ch=arr1[i];
		    digit=ch-'0';
			System.out.println(digit);
			
		}
		
		
		
	}

}
