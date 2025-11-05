package Multiple_INheritance_via_Interface;
// this is hybrid example
interface AB{
	void meow();
}


 class Animals {

	void sound() {
		System.out.println("animal sounds");
	}
}
 

class Dog  extends Animals implements AB{
	void bark() {
		System.out.println("dog barks");
	}

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("dog also meows");
		
	}
}

class Cat extends Animals{
   void meow() {
	   System.out.println("cat meows");
   }
}

public class Animal{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.bark();
		d.meow();
		
		Animals a1=new Animals();
		a1.sound();
		
	}

}
