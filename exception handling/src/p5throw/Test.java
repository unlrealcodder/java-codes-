package p5throw;
// note-> for checked exceptions(compile time) throws needed to use throw 
//but throws not needed at the time of unchecked exception(runtime)
public class Test{
	public static void main(String[] args) {
		
		try {
			withDraw(1000);
		}
		catch(RuntimeException e) {
			System.out.println("transaction failed: "+e.getMessage());
		}
		
		
		
	}
	
	public static void withDraw(int amount) {
		int balance=10000;
		
		if(amount<balance) {
			System.out.println("you withdrawed amount "+amount+"\n your remaining balance is "+(balance-amount));
		}
		else {
			throw new RuntimeException("insufficient balance");
		}
	}
}