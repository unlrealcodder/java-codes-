package reverse_array;
public class ReverseArrayWithoutRecursion{
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,2,4};
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("for second array using while loop");
		// for second array
		
		int [] arr1= {4,3,2,1,0};
		int start1=0;
		int end1=arr1.length-1;
		
		while(start1<end1) {
			int temp1 =arr1[start1];
			arr1[start1]=arr1[end1];
			arr1[end1]=temp1;
			start1++;
			end1--;
		}
		
		for(int j=0;j<arr1.length;j++) {
			System.out.println(arr1[j]);
		}
		
		
		// this second array you can print by another way like
		for(int num:arr1) {
			System.out.println(num);
		}
	}
}