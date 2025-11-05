package demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        int choice;
        System.out.println("\n======Operations======\n");
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multipliaction");
		System.out.println("4.division");
		choice=sc.nextInt();
		
		System.out.println("Enter the a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the b: ");
		int b=sc.nextInt();
		
		switch(choice) {
		case 1-> System.out.println("result :"+(a+b));
		case 2-> System.out.println("result :"+(a-b));
		case 3-> System.out.println("result :"+(a*b));
		case 4-> {
			if(b!=0) {
				System.out.println("result :"+(a/b));
			}
			else
			{
				System.out.println("can't divide");
			}
		}
		default ->System.out.println("Invalid");
		
		
		}
		
		
	}

}
