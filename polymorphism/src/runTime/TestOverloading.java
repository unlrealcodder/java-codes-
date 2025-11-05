package runTime;
// Subclass changes inherited method
class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog barks");
	}
	
}


class Cat extends Animal{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("cat meows");
	}
	
}
public class TestOverloading{
	public static void main(String[] args) {
		Animal a1;
		a1=new Animal();
		a1.sound();
		
		
		a1=new Dog();
		a1.sound();
		
		a1=new Cat();
		a1.sound();
		
		
		
	}
}