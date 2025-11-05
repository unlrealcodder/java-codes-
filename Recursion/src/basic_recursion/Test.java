package basic_recursion;

import java.util.Scanner;

class second_2{
	// n to 1
	void Name(int i,int n) {
		if(i<1)return;
		System.out.println(i+" -> gaurav");
		Name(i-1,n);
	}
}




class second{
	// n to 1
	void name1(int i,int n) {
		if(n<i)return;
		System.out.println(n+" -> vaibhav");
		name1(i,n-1);
		//System.out.println(n+" -> vaibhav");
	}
}
	
	
	
	
	
	class first_2{
		// 1 to n
		// printing from reverse like unique class
		void Name(int i,int n) {
			if(i<1)return;
			Name(i-1,n);
			System.out.println(i+" -> tushar");
		}
	}
	

class first{
	// 1 to n
	void Name1(int i,int n) {
		if(i>n) return;
		System.out.println(i+" -> mahesh");
		Name1(i+1,n);
	}
	
	
	
	
	
}
 class N_to_1{
	
	void Name1(int n) {
		if(n==0) return;
		
		System.out.println(n+" -> raj");
		Name1(n-1);
	}
	
 }

 
 
 
 
 
 class One_to_N{
		
		void Name1(int n) {
			if(n==0) return;
			Name1(n-1);
			System.out.println(n+" -> sumit");
			
		}
		
	 }

 
 
 
 
 
 // like process as first_2 (print from last function to first function)means last called function prints value first and then reverse back
 class UniqueNto1{
	 void Name(int i,int n) {
		 if(i>n)return;
		 Name(i+1,n);
		 System.out.println(i+" -> pratik");
	 }
 }

public class Test{

	
		
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		N_to_1 obj1=new N_to_1();
		obj1.Name1(n);
		
		System.out.println("=====".repeat(50));
		
		One_to_N obj2=new One_to_N();
		obj2.Name1(n);
		
		System.out.println("=====".repeat(50));
		
		first f1=new first();
		f1.Name1(1, n);
		
		System.out.println("=====".repeat(50));
		
		second s1=new second();
		s1.name1(1, n);
		
		System.out.println("=====".repeat(50));
		
		second_2 s2=new second_2();
		s2.Name(n, n);
		
		System.out.println("=====".repeat(50));
		
		first_2 f2=new first_2();
		f2.Name(n, n);
		
		System.out.println("=====".repeat(50));
		
		UniqueNto1 u1=new UniqueNto1();
		u1.Name(1, n);
		
		sc.close();
		
		
		
	}

}
