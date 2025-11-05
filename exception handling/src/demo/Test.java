package demo; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
//		throw is throws the objects of exception or throwable
//		if(b==0)
//			throw new ArithmeticException();
		int c=a/b;
		
		System.out.println("result is : "+c);
		
		}
		// specialized exception
		catch(ArithmeticException ae)
		{
			System.out.println("please dont gove seocnd argument 0");
		}
		
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("please provide at least two arguments");
		}
		
		
		catch(NumberFormatException nfe)
		{
			System.out.println("please provide number as input");
		}
		// generalize->write at last because generalize
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		

	}

}
