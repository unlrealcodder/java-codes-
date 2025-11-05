package IntArray;

import java.util.Scanner;

public class Test{
	
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter the sizes of array ");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("enter the "+n+" elements in array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		
		
		for(int num:arr) {
			System.out.println(num);
		}
		sc.close();
	}
}