package customexception;
//voter class is plane old java object (pojo)
class Voter{
	int age;
	
Voter(int age){
	this.age=age;
	
}

@Override
public String toString() 
{
	// TODO Auto-generated method stub
	return "your age is"+this.age;
}

}// class voter ends here


class AgeException extends RuntimeException
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "your age is not eligible";
	}
}
// class ends here 




public class Test{
	public static void main(String[]args) {
		try {
			int a=Integer.parseInt(args[0]);
		
			
		if(a<18)
		{
			throw new AgeException();
		}
		else
		{
			Voter v1=new Voter(a);
			System.out.println(v1);
		}
		
		}// try ends
		catch(AgeException ae)
		{
			System.out.println(ae);
		}
			// gneralize exceptions 
			
			catch(NumberFormatException nfe)
			{
				System.out.println("Enter the integer properly");
			}
			catch(Exception e)
			{
				System.out.println("something went wrong");
			}
	}
} 