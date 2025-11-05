package reverseString;
public class Demo{
	public static void main(String[] args) {
		String str="mahesh";
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(reverse);
	}
}