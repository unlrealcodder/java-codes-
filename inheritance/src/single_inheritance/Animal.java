package single_inheritance;
public class Animal{
	void sound() {
		System.out.println("Animal makes a sounds");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog barks");
	}
}

class Test{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();// inherit from animal
		d.bark();
	}
}