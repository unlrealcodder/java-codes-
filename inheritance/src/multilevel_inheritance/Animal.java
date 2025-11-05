package multilevel_inheritance;
public class  Animal{
	void eat() {
		System.out.println("Animl eats");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog barks");
	}
}

class Puppy extends Dog{
	void wipe() {
		System.out.println("puppy wipes");
	}
}

class Test{
	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat(); // from animal
		p.bark(); // from do
		p.wipe(); // from puppy
	}
}