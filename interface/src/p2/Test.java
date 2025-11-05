package p2;
interface Race{
	void racer();
}
class Animal{
	void eats() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal implements Race{

	void bark() {
		System.out.println("dog barks");
	}
	@Override
	void eats() {
		// TODO Auto-generated method stub
		//super.eats();
		System.out.println("dog can eat");
	}
	@Override
	
	
	public void racer() {
		// TODO Auto-generated method stub
		System.out.println("dog can run in race");
		
	}
	
}
class Cat extends Animal{
	void meow() {
		System.out.println("cat meows");
	}

	@Override
	void eats() {
		// TODO Auto-generated method stub
		//super.eats();
		System.out.println("cat can eat");
	}
	
	
}

class Ox extends Animal implements Race{
	 void works() {
		// TODO Auto-generated method stub
         System.out.println("ox works");
	}

	@Override
	void eats() {
		// TODO Auto-generated method stub
		//super.eats();
		System.out.println("ox can eat");
	}

	@Override
	public void racer() {
		// TODO Auto-generated method stub
		System.out.println("ox can run in race");
		
	}
	
	
}

public class Test{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eats();
		d.bark();
		d.racer();
		
		Cat c=new Cat();
		c.eats();
		c.meow();
		
		Ox o=new Ox();
		o.eats();
		o.works();
		o.racer();
		
		
	}
}