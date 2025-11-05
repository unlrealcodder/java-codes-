package fibonacci_series;

import java.util.Scanner;

public class Basic{
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=1,b=1;
		int c = 0;
//		c=a+b;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		for(int i=2;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		
	}
	
}