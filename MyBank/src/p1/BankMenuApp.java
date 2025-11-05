// case study 1 Banking Management system
package p1;
import java.util.*;

// wecan't createdirect object of abstract class and it must be inherited
abstract class BankAccount {
	// protected for accessible only for same class and subclasses
	protected String name;
	protected int AccNo;
	protected double balance;

	// parameterised constructor
	BankAccount(String name, int accNo, double balance) {
		this.name = name;
		AccNo = accNo;
		this.balance = balance;
	}

	// abstract function which have only declaration not definition
	public abstract void calculateInterest();

	// function for deposit amount
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited rs " + amount);
	}

	// function for withdraw amount
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdraw rs" + amount);
		} else {
			System.out.println("Insufficient bank balance");
		}
	}

	// function for display the details
	public void displayDetails() {
		System.out.println("Account No: " + AccNo + " Name: " + name + " Balance: Rs" + balance);
	}

	public int getAccNo() {
		return AccNo;
	}
}

// class BankAccount ends here

class SavingsAccount extends BankAccount {
	public SavingsAccount(String name, int accNo, double balance) {
		super(name, accNo, balance);
	}

	public void calculateInterest() {
		double interest = balance * 0.04;
		balance = balance + interest;
		System.out.println("Savings Interest Added: Rs" + interest);
	}
}

// class SalaryAccount
class SalaryAccount extends BankAccount {
	private int inactiveMonths = 0;

	public SalaryAccount(String name, int accNo, double balance) {
		super(name, accNo, balance);
	}

	public void calculateInterest() {
		if (inactiveMonths >= 2) {
			System.out.println("Account frozen due to Inactivity");
		} else {
			System.out.println("No interest for salary account");
		}
	}

	public void recordTransaction() {
		inactiveMonths = 0;
	}

	public void nextMonths() {
		inactiveMonths++;
	}
}

// class CurrentAccount
class CurrentAccount extends BankAccount {
	private double overdraftLimit;

	CurrentAccount(String name, int accNo, double balance, double overdraftLimit) {
		super(name, accNo, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance = balance - amount;
			System.out.println("Withdraw Rs" + amount);
		} else {
			System.out.println("Overdraft limit exceeds.");
		}
	}

	public void calculateInterest() {
		System.out.println("NO interest for current account");
	}
}

// class LoanAccount
class LoanAccount extends BankAccount {

	LoanAccount(String name, int accNo, double loanamount) {
		super(name, accNo, -loanamount); // loan as negative balance
	}

	public void repayloan(double amount) {
		balance = balance + amount;
		System.out.println("Repaid loan: Rs" + amount);
	}

	public void calculateInterest() {
		double interest = balance * 0.1; // negative balance
		balance = balance + interest;
		System.out.println("Loan interest: Rs" + interest);
	}
}

public class BankMenuApp {
    // static is used to avoid calling function by using object
	static Scanner sc = new Scanner(System.in);
	static List<BankAccount> accounts = new ArrayList<BankAccount>();
	static int accCounter = 100;

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n======SBI Bank======\n");
			System.out.println("1.Open Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Interest Calculation");
			System.out.println("5.End of Day Report");
			System.out.println("6.Exit");
			System.out.print("Choose: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1 -> openAccount();
				case 2 -> performDeposit();
				case 3 -> performWithdraw();
				case 4 -> calculateInterestAll();
				case 5 -> showEndOfReport();
				case 6 -> System.out.println("Exiting...");
				default -> System.out.println("Invalid choice");
			}
		} while (choice != 6);
	}

	static void openAccount() {
		System.out.println("\n1.Savings \n2.Salary\n3.Current\n4.Loan");
		System.out.print("Select Account Type: ");
		int type = sc.nextInt();
		sc.nextLine(); // consume newline
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Initial Amount: ");
		double amount = sc.nextDouble();

		accCounter++;
		// BankAccount is abstract class hence only create reference
		BankAccount acc = switch (type) {
			case 1 -> new SavingsAccount(name, accCounter, amount);
			case 2 -> new SalaryAccount(name, accCounter, amount);
			case 3 -> {
				System.out.print("Enter OverDraft Limit: ");
				double limit = sc.nextDouble();
				yield new CurrentAccount(name, accCounter, amount, limit);
			}
			case 4 -> new LoanAccount(name, accCounter, amount);
			default -> null;
		};

		if (acc != null) {
			accounts.add(acc);
			System.out.println("Account Created with Account no: " + accCounter);
		} else {
			System.out.println("Invalid account type.");
		}
	}

	static BankAccount findAccount(int accNo) {
		for (BankAccount acc : accounts) {
			if (acc.getAccNo() == accNo)
				return acc;
		}
		return null;
	}

	static void performDeposit() {
		System.out.print("Enter Account No: ");
		int accNo = sc.nextInt();
		BankAccount acc = findAccount(accNo);
		if (acc != null) {
			System.out.print("Enter Deposit Amount: ");
			double amt = sc.nextDouble();
			acc.deposit(amt);
		} else {
			System.out.println("Account not found");
		}
	}

	static void performWithdraw() {
		System.out.print("Enter Account No: ");
		int accNo = sc.nextInt();
		BankAccount acc = findAccount(accNo);
		if (acc != null) {
			System.out.print("Enter Withdraw Amount: ");
			double amt = sc.nextDouble();
			acc.withdraw(amt);
		} else {
			System.out.println("Account not found.");
		}
	}

	static void calculateInterestAll() {
		System.out.println("\nCalculating interest for all accounts...");
		for (BankAccount acc : accounts) {
			acc.calculateInterest();
		}
	}

	static void showEndOfReport() {
		System.out.println("\n====== End of Day Report ======");
		for (BankAccount acc : accounts) {
			acc.displayDetails();
		}
	}
}
