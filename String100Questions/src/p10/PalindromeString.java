package p10;

public class PalindromeString {

	public static void main(String[] args) {
		String name ="madam";
		char arr[]=name.toCharArray();
		boolean isPalindrome=true;
		for(int i=0;i<name.length()/2;i++) {
	
			if(arr[i]!=arr[name.length()-1-i]) 
			{
				isPalindrome =false;
			}
			
		}
		
		
		
		if(isPalindrome) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
