package myCar;
class Car{
	String color;
	int speed;
	
	void drive() {
		System.out.println("this car is driving");
	}
}
public class MainApp{
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.color="red";
		myCar.speed=40;
		
		System.out.println("my car's color is "+myCar.color);
		System.out.println("my car's speed is "+myCar.speed);
		myCar.drive();
	}
}