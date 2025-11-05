package arrayScan;
import java.util.*;
public class Demo{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter size of array");
	int n=sc.nextInt();
	
	int[]array=new int[n];
	
	System.out.println("enter"+n+"integers");
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
		
	}
	
	System.out.println("your entered:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
		//enhace for loop
		for(int i:array) {
			System.out.println(i);
		}
	}
}