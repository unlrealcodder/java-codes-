package staticRules;
class Demo{
	static int staticVar=10;
	int instanceVar=15;
	
	static void staticMethod() {
		System.out.println("static method");
	}
	
	void instanceMethod() {
		System.out.println("instance method");
	}
}
 
public class Main{ 
	public static void main(String[] args) {
		// static methods and static variables are not belongs to object they can be accessed using class name
		System.out.println(Demo.staticVar);
		Demo.staticMethod();
		
		System.out.println("---------");
		
		// instacne method and instance variable can be accessed using the class object
		Demo d1=new Demo();
		System.out.println(d1.instanceVar);
		d1.instanceMethod();
	}
}