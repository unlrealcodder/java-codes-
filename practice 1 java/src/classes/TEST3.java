package classes;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	
	double sub(int a,int b) {
		return a-b;
	}
}

public class TEST3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1= new Calculator();
		System.out.println("result of add is "+c1.add(2, 3)+" and result of sub is "+c1.sub(3, 5));
		
		
		
		
	}

}
