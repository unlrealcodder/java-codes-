package p10;

public class StringToCharArray {

	public static void main(String[] args) {
		String name="mahesh vilas chikhale";
		System.out.println("this is the string -> "+name);
		char []arr=name.toCharArray();
		System.out.println("\nthis is the string converted to character array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
