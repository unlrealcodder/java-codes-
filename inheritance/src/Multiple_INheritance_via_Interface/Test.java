package Multiple_INheritance_via_Interface;

interface A{
	void methodA();
	}

interface B{
	void methodB();
}

public class Test implements A,B{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("method A is implemented");
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("method B is implemented");
		
	}
	
	
	public static void main(String[] args) {
		Test obj=new Test();
		obj.methodA();
		obj.methodB();
	}

	
	
}