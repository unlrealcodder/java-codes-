package constructorInInheritance;
public class Animal{
	Animal(){
		System.out.println("Animal sounds");
	}
}

class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Dog barks");
	}
}

class Test{
	public static void main(String[] args) {
		Dog d=new Dog();
		
		
	}
}