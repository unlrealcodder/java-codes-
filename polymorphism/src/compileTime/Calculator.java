package compileTime;
// Same class, different parameters
public class Calculator{
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a,double b) {
		System.out.println(a+b);
	}
	
	void  add(int a, int b, int c) {
		 System.out.println(a+b+c);
	}
	
	void add(double a,int b) {
		System.out.println((a+b));
	}
}


class TestOverloading{
	public static void main(String[] args) {
		Calculator calc =new Calculator();
		calc.add(5,3);
		calc.add(5,3.2);
		calc.add(5,3,2);
		calc.add(5.2,3);
		
	}
	
}