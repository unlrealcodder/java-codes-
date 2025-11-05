package p1;
abstract class Animal{
	// abstract class have both methods(functions)1->abstract functions(incomplete) and 2->concrete functions(complete)
	//it cannot be instantiated means we cannot create object of it but make reference of this class
	// abstract class is used as base class
	abstract void sound();
	// abstract method has no body only have signature and must be implemented(override) by subclass
	
	void sleep() {
		System.out.println("sleeping....");
	}
}

class Dog extends Animal{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog barks");
		
	}
	
}
public class Test{
	public static void main(String[] args) {
		Animal a1=new Dog();// up casting
		a1.sleep();// inherited from animal
		a1.sound();// dogs implementation
	}
}