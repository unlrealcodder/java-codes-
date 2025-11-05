package Hybrid_Inheritance;

interface A{
	void methodA();
}

class B{
	void methodB() {
		System.out.println("B");
	}
}

public class Test extends B implements A{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.methodA();
		t.methodB();
	}
	
}