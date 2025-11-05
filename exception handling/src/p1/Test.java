package p1;
public class Test{
	public static void main(String[] args) {
		
		
		try { 
			int []numerators= {10,200,30,40};
		int denominators[]= {1,2,0,4};
		
		for(int i=0;i<10;i++) {
			
			System.out.println(divide(numerators[i],denominators[i]));}
			
		
	}
	 catch(ArrayIndexOutOfBoundsException ae) {
		//System.out.println("arrayindexoutofbounds exception");
		 System.out.println(ae);
	} 
		finally {
			System.out.println("always run second ");
		}
	
	
		
	}
		
	
	public static int divide(int a,int b) {
		try { return a/b;}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		finally{
			System.out.println("always run ");
		}
		
		return -1;
	}
	
	
}