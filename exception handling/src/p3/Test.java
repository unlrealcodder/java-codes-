package p3;

import jdk.jfr.StackTrace;

public class Test{
	public static void main(String[] args) {
		try {
			level1();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			//System.out.println(ae);
			
			StackTraceElement[] stackTrace=ae.getStackTrace();
			for(int i=0;i<stackTrace.length;i++) {
				System.out.println(stackTrace[i]);
			}
			
			//ae.printStackTrace();
			
		}
		finally{
			System.out.println("always run ");
		}
		
	}
	
	
	
	public static void level3() {
		System.out.println("level 3 called");
		int[]array=new int[5];
		array[5]=10;
		System.out.println("in level 3 \n"+array[4]);
	}
	
	public static void level2() {
		System.out.println("level 2 called");
		level3();
	}
	
	public static void level1() {
		System.out.println("level 1 called");
		level2();
	}
}