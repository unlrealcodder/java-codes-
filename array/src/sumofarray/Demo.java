package sumofarray;
public class Demo{
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int res=0;
		for(int i=0;i<arr.length-1;i++) {
			 res=arr[i]+arr[i+1];
		}
		System.out.println("total is = "+res);
		
		// using enhance for loop
		int temp=0;
		for(int i:arr) {
			temp=temp+i;
		}
		System.out.println("total is = "+res);
		
		
		
		
		// for loop for traversing
		for(int j=0;j<arr.length-1;j++) 
		        {
					arr[j]=arr[j]+arr[j+1];	
				} 
		           
		arr[arr.length-1]=arr[arr.length-1]+arr[arr.length-2];
			
		//for loop for printing
		for(int j=0;j<arr.length;j++) {
			
				System.out.println(arr[j]);
			
		}
		
		// print using enhance
		for(int s:arr) {
			System.out.println(s);
		}
			}
		
		
	}
