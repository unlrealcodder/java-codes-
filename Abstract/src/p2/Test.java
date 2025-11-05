package p2;
abstract class Vehicle{
	void start() {
		System.out.println("vehicle is runing");
	}
	
	void stop() {
		System.out.println("vehicle is stopping");
	}
	
	abstract void drive();
}

class Car extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("car is acing on the track");
	}
	
}

class Bike extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("bike can be drive on road");
		
	}
	
}

public class Test{
	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.start();
		v1.drive();
		v1.stop();
		
		System.out.println("     ");
		
		Vehicle v2=new Bike();
		v2.start();
		v2.drive();
		v2.stop();
		
	}
}