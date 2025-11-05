package classes;
class Account{
	int AccountNUmber;
	String AccountHolder;
	double balance;
	
	void deposit(double amount) {
		balance+=amount;
		System.out.println("amount deposited is "+amount);
		System.out.println("current balance is "+balance+"\n");
	}
	
	void withdraw(double amount){
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdrawed amount is "+amount);
			System.out.println("current balance is "+balance+"\n");
		}
		else {
			System.out.println("insufficient balance");
		}
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1= new Account();
		account1.AccountNUmber=1234;
		account1.AccountHolder="mahesh";
		account1.balance=2000;
		
		account1.deposit(2000);
		account1.withdraw(4000);
	}

}
