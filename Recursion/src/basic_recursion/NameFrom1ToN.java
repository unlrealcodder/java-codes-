package basic_recursion;

import java.util.Scanner;

public class NameFrom1ToN {

	
	
	
	 static void Name(int i,int n) {
		 if(i>n) {
			 return;
		 }
		 System.out.println(i+" -> "+"raj");
		 
		 Name(i+1,n);
		 
	 }
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		
		Name(1,n);
		
	}

}
