package p3;
public class Demo{
	public static void main(String[] args) {
		String s2="mahesh";
		System.out.println(s2);
		String s1=new String("mahesh");
		System.out.println(s1);
		// both reference are at different location hence output will be false
		if(s1==s2) {
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		
		// both references having same content hence true
		if(s1.equals(s2)){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		String s3="sumit";
		System.out.println(s3);
		String s4=new String("sumit").intern();
		System.out.println(s4);
		// we make heap reference forcefully scp reference using intern is called string interning
		if(s3==s4) {
			System.out.println("true");
		}
		else {
			System.out.println(false);
		}
		
		if(s3.equals(s4)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		String s5="raj";
		System.out.println(s5);
		String s6="ghraj";
		System.out.println(s6);
		if(s5==s6) {
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		
		if(s5.equals(s6)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
	}
}