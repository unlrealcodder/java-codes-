package p4;
interface Chargeable{
	void charge();
}

abstract class Device{
	String brand;

	Device(String brand) {
		super();
		this.brand = brand;
	}
	
	void powerOn() {
		System.out.println(brand+" Device is powering on");
	}
	
	 void operate() {
		System.out.println(brand+" is operating");
	}
	 
	 abstract void powerConsumimg();
}
class Laptop extends Device implements Chargeable{

	Laptop(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	
	void powerOn() {
		System.out.println(brand+" laptop device is powering on");
	}
	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println(brand+" is charging");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println(brand+" is running development tools");
	}


	@Override
	void powerConsumimg() {
		// TODO Auto-generated method stub
		System.out.println(brand+" laptop is power consuming device");
	}
	
}


class Mobile extends Device implements Chargeable {
	

	Mobile(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println(brand+" is runnig apps");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println(brand+" mobile is charging");
		
	} 
	
	void powerOn() {
		System.out.println(brand+" mobile device is powering on");
	}

	@Override
	void powerConsumimg() {
		// TODO Auto-generated method stub
		System.out.println(brand+" is power consuming device");
	}
	}

class Typewritter extends Device{

	Typewritter(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println(brand+" typewritter is operating");
	}

	@Override
	void powerConsumimg() {
		// TODO Auto-generated method stub
		System.out.println(brand+" is not power consuming device");
	}
	
}


public class Test{
	
	public static void main(String[] args) {
		Device m1=new Mobile("samsung");
		m1.powerOn();
		m1.operate();
		//m1.charge();
		// this is the safe cast meaning down cast
		if(m1 instanceof Chargeable) {
			((Chargeable) m1).charge();
		}
		m1.powerConsumimg();
		
		System.out.println("------");
		
		Device l1=new Laptop("hp");
		l1.powerOn();
		l1.operate();
		//l1.charge();
		l1.powerConsumimg();
		if(l1 instanceof Chargeable) {
			((Chargeable) l1).charge();
		}
		
		System.out.println("-----");
		
		Device t1=new Typewritter("lg");
		t1.powerOn();
		t1.operate();
		t1.powerConsumimg();
		
	}
}