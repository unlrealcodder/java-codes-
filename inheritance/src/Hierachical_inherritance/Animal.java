package Hierachical_inherritance;
public class Animal{
	void sound() {
		System.out.println("animal sounds");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog barks");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("cat meows");
	}
}

class Test {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.bark();
		
		Cat c =new Cat();
		c.sound();
		c.meow();
		
	}
}