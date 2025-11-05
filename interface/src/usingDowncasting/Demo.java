package usingDowncasting;
interface MyInterface{
	
	abstract void interfaceAbstractMethod();
	
	default void interfaceDefaultMethod() {
		System.out.println("default method in interface");
	}
	
	static void interfaceStaticMethod() {
		System.out.println("static method in interface");
	}
}

abstract class MyAbstractClass{
	abstract void abstractClassMethod();
	
	void concreteClassMethod() {
		System.out.println("concrete method in abstract class ");
	}
}


class MyClass extends MyAbstractClass implements MyInterface{

	@Override
	public void interfaceAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("implemented abstract method from interface");
	}

	@Override
	void abstractClassMethod() {
		// TODO Auto-generated method stub
		System.out.println("overridden abstract method from abstract class");
		
	}
	
}


public class Demo{
	public static void main(String[] args) {
		MyAbstractClass obj=new MyClass();
		MyClass myclassobj= (MyClass)obj;
		
		myclassobj.interfaceAbstractMethod();
		myclassobj.interfaceDefaultMethod();
		MyInterface.interfaceStaticMethod();
		
		
		obj.abstractClassMethod();
		obj.concreteClassMethod();
	}
}