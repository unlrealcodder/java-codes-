package p1;
public class Demo{
	public static void main(String[] args) {
		try {
		int[]array= {1,2,3};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Don't pass the extra argument");
		}
		
		try {
			int[]arr=null;
			System.out.println(arr.length);
		}
		
		
		catch(NullPointerException npe) {
			System.out.println("Pass the value");
		}
		
	int[]array1= {4,5,6,7};
	for(int i=0;i<array1.length;i++) {
		System.out.println(array1[i]);
	}
		
	}
}