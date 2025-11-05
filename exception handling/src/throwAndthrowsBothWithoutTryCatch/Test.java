package throwAndthrowsBothWithoutTryCatch;

import javax.management.RuntimeErrorException;

public class Test{
	public static void main(String[] args) throws NullPointerException{
		
		System.out.println("for student");
		method1();
		
		System.out.println("mahesh");
		
	}
	
	public static void method1() throws NullPointerException{
		String name=null;
		if(name==null) {
			throw new NullPointerException("name is null in method1");
		}
		int length=name.length();
		System.out.println(length);
		
	}
}