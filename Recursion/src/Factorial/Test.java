package Factorial;

import java.util.Scanner;

public class Test{
	
	static void Fact(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		Fact(n-1,sum*n);
	}
	
	
	static int fact2(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact2(n-1);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the interger: ");
		int n=sc.nextInt();
		Fact(n,1);
		
		System.out.println(fact2(4));
		
	}
}