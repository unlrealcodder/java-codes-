package bank;

public class BankAccount {
int AccNum;
String name;
double banknum;
// static means one for a class 
// static inter_rate=9.7;  which also right but
//this is not recommended method to initialize in java 
//hence we give seperate block for the initialization
static double inter_rate;
// when class is loaded in the jvm then the static block get priority for execution
static {
	inter_rate=9.7;
}

int getAccNum() {
	return AccNum;
}
void setAccNum(int accNum) {
	AccNum = accNum;
}
String getName() {
	return name;
}
void setName(String name) {
	this.name = name;
}
double getBanknum() {
	return banknum;
}
void setBanknum(double banknum) {
	this.banknum = banknum;
}
double getInter_rate() {
	return inter_rate;
}
// make function static and remove "this" keyword
//static functions needed to access static variables
//we cannot use non-static variables inside the static function
static void setInter_rate(double ir) {
	inter_rate = ir;
	//System.out.println(name); this is example of we can't use nonstatic variable inside the static funuction
}
//default constructor
BankAccount() {

	AccNum = 100;
	this.name = "not given";
	this.banknum =0 ;
	//this.inter_rate =0.0;
	
	
}
BankAccount(int accNum, String name, double banknum) {
	
	AccNum = accNum;
	this.name = name;
	this.banknum = banknum;
	//this.inter_rate = inter_rate;
}

void display() {
	System.out.println("account number is:" + this.AccNum +"\n" + "Bank name :"+this.name+"\n"+"Bank number is :"+this.banknum+"\n"+"rate of interest"+this.inter_rate+"\n");
}



}// bank class ends here



class StaticPractice{
	public static void main(String[]args) {
		BankAccount b1= new BankAccount(125785,"sbi",254);
		BankAccount b2=new BankAccount(123,"vinayak",568);
		BankAccount b3=new BankAccount(321,"gaurav",8547);
		b1.display();
		b2.display();
		b3.display();
		
		// call which independent of object
		// we can call static function also using class object but not recommended
		BankAccount.setInter_rate(8.5);
		System.out.println("for the last rate is changed");
		b1.display();
	}
}


