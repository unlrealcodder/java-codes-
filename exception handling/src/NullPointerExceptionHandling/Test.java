package NullPointerExceptionHandling;
public class Test{
	public static void main(String[] args)  throws NullPointerException{
		
		System.out.println("for student1");
		String studentName1=null;
		try {
			
			int length=studentName1.length();
			
		}
		catch(NullPointerException npe) {
			System.out.println("null pointer exception occurs for studentname1");
			System.out.println(npe);
		}
		finally {
			System.out.println("bye");
		}
		
		
		System.out.println("for student 2");
		try {
			method1();
		}
		catch(NullPointerException npe) {
			System.out.println("null pointer exception occurs for studentname 2");
			System.out.println(npe);
		}
		finally {
			System.out.println("bye bye");
		}
		
		System.out.println("for student 3");
		try {
			method2();
		}
		catch(NullPointerException npe) {
			System.out.println("null pointer exception occurs for studentname 3");
			System.out.println(npe);
		}
		
		finally {
			System.out.println("bye bye bye");
		}
		
		System.out.println("for student 4");
		try {
			method3();
		}
		catch(NullPointerException npe) {
			System.out.println("null pointer exception occurs for the studentname 4");
			System.out.println(npe);
		}
		
		finally {
			System.out.println("bye bye bye bye");
		}
		
	}
	
	
	
	
	
	public static void method1() {
		String studentName2=null;
		int length2=studentName2.length();
	}
	
	
	public static void method2() throws RuntimeException {
		String studentName3=null;
		int length3=studentName3.length();
	}
	
	public static void method3()  throws RuntimeException{
		String studentName4 =null;
		if( studentName4==null) {
			
			throw new NullPointerException();
		}
		
	    int length4=studentName4.length();
	}
	
	
}