package customException2;
class BankAccount{
  //double amount;
 double balance;
  
BankAccount(double amount) {
	super();
	// TODO Auto-generated constructor stub
	this.balance=amount;
	
}
public void withDraw(double amount) throws InsuficientFundsException {
	if(amount>balance) {
		throw new InsuficientFundsException(amount);
	}
	balance-=amount;
}
  
  
	
}

// custom exception class
class InsuficientFundsException extends Exception{

	private double amount;

	InsuficientFundsException(double amount) {
		super("what do you want? you don't have money?");
		// TODO Auto-generated constructor stub
		this.amount=amount;
	}

	
	
}
public class Test{
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(100);
		try {
			ba.withDraw(1000);
		}
		catch(InsuficientFundsException e) {
			System.out.println(e);
			
		}
	}
}