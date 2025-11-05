package Sum_of_numbers;

import java.util.Scanner;

public class Sum_1_to_N{
	
	static void Sum(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
			
		}
		
		Sum(i-1,sum+i);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number");
		int n =sc.nextInt();
		Sum(n,sum);
	}
}