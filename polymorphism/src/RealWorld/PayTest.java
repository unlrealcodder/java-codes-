package RealWorld;
class Payment{
	void pay(double amount) {
		System.out.println("paying "+amount+" RS with generic method");
	}
}


class CreditCard extends Payment{
	void pay(double amount) {
		System.out.println("paying "+amount+" RS using creditcard");
	}
}

class UPI extends Payment{
	void pay(double amount) {
		System.out.println("paying "+amount+" RS using upi");
	}
}
public class PayTest{
	public static void main(String[] args) {
		Payment p1;
		p1=new Payment();
		p1.pay(2000);
		
		p1=new CreditCard();
		p1.pay(5000);
		
		p1=new UPI();
		p1.pay(1000);
	}
}