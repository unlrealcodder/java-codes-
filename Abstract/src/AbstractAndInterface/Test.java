package AbstractAndInterface;
interface Flyable{
	void fly();
}
abstract class Bird{
	void eat() {
		System.out.println("bird is eating");
	}
	
	abstract void sound();
}

class Sparrow extends Bird implements Flyable{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("chirp chirp");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("sparrow is flying");
	}
	
	
	
}

public class Test{
	public static void main(String[] args) {
		//Bird b1=new Sparrow();
		//b1.eat();
	//	b1.fly();->not accessible because bird doest know about flyable
		
		//Flyable f=new Sparrow();
		//f.fly();
		//f.eat();-> not accessible because flyable doesn't have eat
		
		
		Sparrow s1=new Sparrow();
		s1.fly();
		s1.eat();
		
	}
}