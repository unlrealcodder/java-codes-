package methodsinInterface;

interface MyInterface{
	// abstract method which is always public and must be implemented
	void abstractMethod();
	
	//default method->public ,can be overridden if needed
	default void defaultMethod() {
		System.out.println("default method in interface");
	}
	
	//static method->public ,can't be overridden,accessed via interface name
	static void staticMethod() {
		System.out.println("static method in myinterface");
		
	}
	
	//private method->for internal use only
	private void privateHelper() {
		System.out.println("private helper method in interface");
	}
	
	//private static method->internal use only for static context
	private static void privateStaticHelper() {
		System.out.println("private static helper in interface");
		
	}

}



class MyClass implements MyInterface{

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented in myclass");
	}
	
	@Override
	
	public void defaultMethod() {
		System.out.println("default method overrideden in myclass ");
	}
	
}


public class Demo{
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		
		// call abstract method implemented by class
		obj.abstractMethod();
		
		//call overridden default method
		obj.defaultMethod();
		
		// called static method using interface name
		MyInterface.staticMethod();
		
		//private methods are not accessible outside the interface
	}
}