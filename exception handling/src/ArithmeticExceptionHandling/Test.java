package ArithmeticExceptionHandling;
public class Test{
	public static void main(String[] args) {
		try {
			method1();
		}
		catch(RuntimeException re) {
			System.out.println("welcome for x and y");
			System.out.println("arithmetic exception occurs for x and y");
			System.out.println(re);
		}
		finally {
			System.out.println("bye bye....");
		}
		
		try {
			method2();
		}
		catch(RuntimeException re) {
			System.out.println("welcome for p and q");
			System.out.println("arithmetic exception occurs for p and q");
			System.out.println(re);
		}
		
		finally {
			System.out.println("bye bye ......");
		}
		
		
		
		try {
			System.out.println("welcome for a and b");
			int a=1;
			int b=0;
			int c=a/b;
			System.out.println("result is : "+c);
		}
		catch(ArithmeticException ae) {
			System.out.println("arithmetic exception occurs for b");
			System.out.println(ae);
		}
		finally {
			System.out.println("bye bye....");
		}
		
		
		
		
		
		
	}
	public static void method1()  throws RuntimeException{
		int x=1;
		int y=0;
		int z=x/y;
		System.out.println("result 2 is "+z);
		
	}
	
	public static void method2() {
		int p=2;
		int q=1;
		if(q==0) {
			throw new RuntimeException();
		}
		int r=p/q;
		System.out.println("result 3 is "+r);
	}
}