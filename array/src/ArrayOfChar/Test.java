package ArrayOfChar;

import java.util.Scanner;

public class Test{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			char[]arr=new char[5];
			arr[0]='a';
			arr[1]='b';
			arr[2]='c';
			int ch;
			for(int i=3;i<arr.length;i++) {
				arr[i]=sc.next().charAt(0);
			}
			
			for(char i:arr) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}