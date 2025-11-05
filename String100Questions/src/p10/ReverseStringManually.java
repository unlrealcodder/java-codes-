package p10;

public class ReverseStringManually {

	public static void main(String[] args) {
		String name ="mahesh vilas chikhale";
		char[] arr=name.toCharArray();
		for(int i=0;i<arr.length/2;i++) {
			int start=i;
			int end=arr.length-1-i;
			char temp=arr[i];
			arr[start]=arr[end];
			arr[end]=temp;
			
		}
		
		System.out.println(arr);

	}

}
