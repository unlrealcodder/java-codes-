package throwskeyward;
// java mandates to write try catch block for checked exceptions
// doesn't mandate for the unchecked exceptions
class Voter{
	int age;

	Voter(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return ("voter age is"+this.age+"ja tuze voter card de diya");
	}
	
	void validate() throws AgeException
	{
		// don't write try and catch write throws and insist user to write try and ctch to handle exception
		if(this.age<18)
		{
			throw new AgeException();
		}
		else
		{
			System.out.println(this.toString());
		} 
		
	
	}
	
}// voter ends here

class AgeException extends Exception
{

	@Override
	public String toString() {
		return "your are not eligible for voting";
	}
	
}// AgeException ends here

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		int a=Integer.parseInt(args[0]);
		Voter v1= new Voter(a); 
		v1.validate();
	            
				
		 }
		 
		catch(AgeException e)
		{
			
			System.out.println(e);
			
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("entr the number instead of alphabet");
			nfe.printStackTrace();
		}
		
		catch(Exception ex)
		{
			System.out.println("something went wrong");
			
		}
		finally
		{
			System.out.println("ye hamesh execute hota hi hai");
		}
		
		
		

	}

}
