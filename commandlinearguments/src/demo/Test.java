package demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		// for run the program for passing argument follow the instructions
		//right click >run configuration > select package and project > go to argument > program argument > pass arguments>apply and run
		// if we pass integer value in arguments then it takes as string
		
		
		//there is Integer wrapper class which convert string to integer
		//pafrseInt is called utility function
		//parseInt is static function which is called with help of class name
		int a= Integer.parseInt(args[2]);
		int b=Integer.parseInt(args[3]);
		// Integer wrapper class represents an object of an Integer object 
		// like    ->   Integer obj=new Integer.valueof(10);
		
		
		System.out.println("integer a is : "+args[2]);
		System.out.println("integer b is : "+args[3]);
		System.out.println("addition is : "+(a+b));

		// if we doesn't pass any argument -> arrayindexoutofbounds
		// if we pass character with integer -> NumberFormatException
		// a/0 -> ArithmeticException
	}

}
