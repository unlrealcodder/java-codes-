package newReverseString;


public class Demo{
	public static void main(String[] args) {
		String str="cat";
		
		char[]arr=str.toCharArray();
		
		for(int i=0;i<arr.length/2;i++) {
			int front = i;
			int end=arr.length-1-i;
			
			char temp=arr[front];
			arr[front]=arr[end];
			arr[end]=temp;
			
			
		}
		System.out.println(arr);
		String reverse=new String(arr);
		System.out.println(reverse);
	}
}