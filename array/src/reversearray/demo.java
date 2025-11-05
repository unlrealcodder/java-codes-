package reversearray;



public class demo{
	public static void main(String[] args) {
		int []array= {1,2,3,4};
		int []array1= {1,2,3,4};
		
		System.out.println("reverse array");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		
		
		
		
		for(int x=0;x<array1.length/2;x++) {
		    int temp=array1[x];
		    array1[x]=array1[array1.length-1-x];
		    array1[array1.length-1-x]=temp;
		    
		}
		
		
		System.out.println("reverse for array1");
		for(int x=0;x<array1.length;x++) {
			System.out.println(array1[x]);
		}
		
		
	}
}