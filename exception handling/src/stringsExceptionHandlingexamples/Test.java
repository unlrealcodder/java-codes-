package stringsExceptionHandlingexamples;
public class Test{
	public static void main(String[] args) {
		String name1="1";
		String name2="2";
		
	    int num1=Integer.parseInt(name1);
	    int num2=Integer.parseInt(name2);
	    System.out.println(name1+name2);
	    System.out.println(num1+num2);
	    
	    
	    try {
			String name="mahesh";
			int num=Integer.parseInt(name);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	    
	    
	}
}