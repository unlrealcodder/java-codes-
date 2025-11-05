package reverse_array;

public class ReverseArrayUsingRecursion {

	static void reverse(int [] arr,int start,int end) {
		if(start>=end) {
			
			return ;
			
			
		}
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		reverse(arr,start+1,end-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4};
		int start=0;
		int end=arr.length-1;
		
		reverse(arr,start,end);
		
		// print reverse array
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
