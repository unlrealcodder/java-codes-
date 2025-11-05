package p3;
interface chargeable{
	void charge();
}
abstract class Device implements chargeable{
	String brand;

	Device(String brand) {
		this.brand = brand;
		System.out.println("device constructor is called");
	}
	
	void powerOn() {
		System.out.println(brand+"is powering on");
	}
	
	abstract void operate();
	
}

class Mobile extends Device{

	Mobile(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println(brand+"mobile is charging");
		
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println(brand+"is opening apps");
		
	}
	
}

class Laptop extends Device{

	Laptop(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println(brand+"is charging");
		
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println(brand+"is running development tools");
		
	}
	
}

public class Test{
	public static void main(String[] args) {
		Device d1=new Mobile("samsung");
		d1.powerOn();
		d1.operate();
		d1.charge();
		System.out.println("-----  ");
		d1=new Laptop("HP");
		d1.powerOn();
		d1.operate();
		d1.charge();
		
		
	}
}