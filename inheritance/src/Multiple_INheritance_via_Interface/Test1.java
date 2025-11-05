package Multiple_INheritance_via_Interface;


interface Sounds{
	void bark();
	void meow();
}

class Animalia{
	void sound() {
		System.out.println("animal sounds");
	}
}



 class Cat1 extends Animalia implements Sounds{

	
	
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("CAT ALSO n BARKS");
	}

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("cat meows");
		
	}

	
}



class Dog1 extends Animalia implements Sounds{
	

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("DOG ALSO MEOW");
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("dog barks");
		
	}
}


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 c=new Cat1();
		c.meow();
		c.bark();
		
		Dog1 d=new Dog1();
		d.bark();
		d.meow();
		
		

	}

}
