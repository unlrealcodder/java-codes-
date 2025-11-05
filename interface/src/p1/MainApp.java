package p1;
public class MainApp {
	public static void main(String[] args) {
		
		//approach 1:Implement class
		ArithmeticOp addition =new Addition();
		System.out.println(addition.calc(12,12));
	 	
		//approach 2:Anonymous inner class
		ArithmeticOp subtract =new ArithmeticOp() {
			public int calc(int op1,int op2) {
				return op1-op2;
			}
		};
		System.out.println(subtract.calc(1, 10));
		
		//Approach 3: Lambda Expression
		// -> this symbol is called as lambda operator
		// (op1,op2) called parameters of function in interface
		// op1*op2 called body of function in interface
		// lambda only works for functional interfaces
		ArithmeticOp multiply =(op1,op2)->op1*op2;
		System.out.println(multiply.calc(12,12));
		
		
		// if multiple lines
		ArithmeticOp add =(op1,op2)->{
			System.out.println("addition with lambda");
			return op1+op2;
					};
					
		System.out.println(add.calc(12,12));
		
		
		
		ArithmeticOp divide =(op3,op4)->op3/op4;
		System.out.println(divide.calc(12,12));
	}
}