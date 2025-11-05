package switchcasesInt;

import java.util.Scanner;

public class Demo{
	static Scanner sc;
	static {
		
	    sc= new Scanner(System.in);
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		int day=sc.nextInt();
		System.out.println("Enter the string : ");
		String str=sc.next();
		
		
		switch(day) {
		case 1:{
			System.out.println("sunday");
			break;
		}
		
		case 2:{
			System.out.println("monday");
			break;
		}
		
		case 3:{
			System.out.println("tuesday");
			break;
		}
		
		case 4:{
			System.out.println("wednesday");
			break;
		}
		
		case 5:{
			System.out.println("thursday");
			break;
		}
		
		case 6:{
			System.out.println("friday");
			break;
		}
		
		case 7:{
			System.out.println("saturday");
			break;
		}
		
		default:{
			System.out.println("invalid");
		}
		}
		
		
		
		
		
		
		switch(str) {
		case "apple":{
			System.out.println("it is apple");
			break;
		}
		
		case "mahesh":{
			System.out.println("he is mahesh");
			break;
		}
		
		default:{
			System.out.println("invalid");
		}
		}
	}
}