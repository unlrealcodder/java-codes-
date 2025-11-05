package p3;
class Demo{
	static int value=100;
	
	static {
		//value=100;
		System.out.println("static block initialzed");
		System.out.println(value);
		int temp=value;
		System.out.println("temp");
		
		dance();
		
		
	}
	
	static void dance() {
		System.out.println("lets dance");
	}
	
	static void show() {
		System.out.println("value is : "+value);
	}
}

public class Test{
	public static void main(String[] args) {
		
		Demo.show();// static block runs before this
		
		
		//note -> main function loaded by jvm after that static block execute and then main block executes
	}
}