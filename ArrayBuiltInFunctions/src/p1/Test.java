package p1;

import java.util.Arrays;

public class Test{
	public static void main(String[] args) {
		int []arr= {34,43,67,2,7,65,1,88,3,2,};
		
		//Arrays.toString(array)
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort(array)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Arrays.copyOf(original, newLength)
		int[] copy=Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(copy));
		
		//Arrays.copyOfRange(original, from, to)
		int []part=Arrays.copyOfRange(arr, 3, 5);
		System.out.println(Arrays.toString(part));
		
		//Arrays.equals(array1, array2)
		int []a= {1,2};
		int []b= {1,2};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, arr));
		
		//Arrays.fill(array, value)
		int num[]=new int[5];
		Arrays.fill(num, 7);
		System.out.println(Arrays.toString(num));
		
		//Arrays.binarySearch(array, key)
		int[]number= {1,45,65,3};
		int index=Arrays.binarySearch(number,65);
		System.out.println(index);
		
		//length Property (not a method)
		System.out.println(number.length);
	}
}