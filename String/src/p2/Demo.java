package p2;

import java.util.Scanner;

public class Demo{
	static Scanner ch;
	
	static {
		
		
		 ch=new Scanner(System.in);
		 
	}
	public static void main(String[] args) {
		int a=ch.nextInt();
		System.out.println(a);
		
		double b=ch.nextDouble();
		System.out.println(b);
		
		char c=ch.next().charAt(0);
		System.out.println(c);
		
		String s1=ch.next();
		System.out.println(s1);
		
		String s2=ch.nextLine();
		System.out.println(s2);
	}
}