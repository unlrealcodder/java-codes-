package ArrayOfString;

import java.util.Scanner;

public class Test{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			String []arr=new String[3];
			arr[0]="mahesh";
			arr[1]="sumit";
			arr[2]="gaurav";
			
			for(String n:arr) {
				System.out.println(n);
			}
			
			
			double []brr=new double[3];
			brr[0]=12.3;
			brr[1]=43.56;
			brr[2]=34;
			
			for(double n:brr) {
				System.out.println(n);
			}
			
			
			System.out.println("enter size of crr");
			int n=Integer.parseInt( sc.nextLine());
    
			
			String []crr=new String[n];
			
			for(int i=0;i<crr.length;i++) {
				crr[i]=sc.nextLine();
			}
			
			for(String m:crr) {
				System.out.println(m);
			}
			
			
			
			System.out.println("enter size of drr");
			int x=sc.nextInt();
			sc.nextLine();
    
			
			String []drr=new String[x];
			
			for(int i=0;i<drr.length;i++) {
				drr[i]=sc.nextLine();
			}
			
			for(String m:crr) {
				System.out.println(m);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}