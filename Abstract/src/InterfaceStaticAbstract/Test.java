package InterfaceStaticAbstract;
interface Racer{
	void  race();
}

abstract class Animal{
	static int animalCount=0;
	static int racerCount=0;
	static int nonRacerCount=0;
	
	
	
	Animal(boolean isRacer){
		animalCount++;
		if(isRacer) {
			racerCount++;
		}
		else {
			nonRacerCount++;
		}
	}
	
	static void showCount() {
		System.out.println(animalCount+" total animals ");
		System.out.println(racerCount+"  racer animals ");
		System.out.println(nonRacerCount+"  non-racer animals ");
	}
	
	abstract void eat();
	abstract void sleep();
	 abstract void walk();
	
}

class Dog extends Animal implements Racer{
	String dogy;

	

	Dog(String dogy) {
		super(true);
		// TODO Auto-generated constructor stub
		this.dogy=dogy;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(dogy+" can eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(dogy+" can sleep");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println(dogy+" can walk");
	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println(dogy+" can run in race");
	}
	
	
}

class Cat extends Animal{

	String caty;
	
	

	Cat(String caty) {
		super(false);
		// TODO Auto-generated constructor stub
		this.caty=caty;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(caty+" can eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(caty+" can sleep");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println(caty+" can walk");
	}
	
}

class Horse extends Animal implements Racer{

	
	String badal;
	
	

	Horse(String badal) {
		super(true);
		this.badal=badal;
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(badal+" can eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(badal+" can sleep");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println(badal+" can walk");
	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println(badal+" can run in race");
	}
	
}

class Bull extends Animal implements Racer{

	
	String bakasur;
	
	

	Bull(String bakasur) {
		super(true);
		// TODO Auto-generated constructor stub
		this.bakasur=bakasur;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(bakasur+" can eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(bakasur+" can sleep");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println(bakasur+" can walk");
	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println(bakasur+" can run in race");
	}
	
}

class Cow extends Animal{

	String ganga;
	
	

	Cow(String ganga) {
		super(false);
		// TODO Auto-generated constructor stub
		this.ganga=ganga;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(ganga+" can eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(ganga+" can sleep");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println(ganga+" can walk");
	}
	
}

public class Test{
	public static void main(String[] args) {
		Animal d1=new Dog("pintya");
		d1.eat();
		d1.walk();
		d1.sleep();
		if(d1 instanceof Racer ) {
			((Racer)d1).race();
		}
		
		System.out.println("-----");
		
		Animal c1=new Cat("mani");
		c1.eat();
		c1.walk();
		c1.sleep();
		
		System.out.println("-----");
		
		Animal h1=new Horse("badal");
		h1.eat();
		h1.walk();
		h1.sleep();
		if(h1 instanceof Racer ) {
			((Racer)h1).race();
		}
		
		System.out.println("-----");
		
		Animal b1=new Bull("bakasur");
		b1.eat();
		b1.walk();
		b1.sleep();
		if(b1 instanceof Racer ) {
			((Racer)b1).race();
		}
		
		System.out.println("-----");
		
		Animal c2=new Cow("ganga");
		c2.eat();
		c2.walk();
		c2.sleep();
		
		System.out.println("-----");
		
		Animal.showCount();
		
		
	}
}