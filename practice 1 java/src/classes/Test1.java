package classes;
class Car{
	int speed;
	String color;
	
	void drive() {
		System.out.println("The "+color+" car is driving at speed "+speed+" km/hr");
	}
}
public class Test1{
	public static void main(String[] abrgs) {
		Car car1=new Car();
		car1.speed=90;
		car1.color="blue";
		car1.drive();
		
		Car car2=new Car();
		car2.speed=100;
		car2.color="black";
		car2.drive();
	}
}