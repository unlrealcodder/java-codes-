package customException3;





class Animal {

	

	public double standard;
	Animal(double standard){
		this.standard=standard;
		System.out.println("animal for sold base price is "+standard);
	}

	public void soldAnimal(double price) throws InsuficientAmountException {
		if(price<standard) {
			throw new InsuficientAmountException();
		}
		System.out.println("animal can be sold beacuse "+price+"is greater than "+standard);
	}
}
//animal ends here


//custom starts here
class InsuficientAmountException extends Exception{
	InsuficientAmountException(){
		super("Animal is not soldable you don't have money");
	}
}


public class Test {
	public static void main(String[] args)  {
		Animal a=new Animal(10000);
		try {
			a.soldAnimal(88810);
		}
		catch(InsuficientAmountException e) {
			System.out.println(e);
		}
	}

	
}