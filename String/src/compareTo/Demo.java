package compareTo;
public class Demo{
	public static void main(String[] args) {
		String name1="mahesh";
		String name2="mahesh1";
		
		
	//	s1>s2 -> return positive value
	//  s1==s2 -> return 0
	//  s1<s2 -> return	negative value
		
		if(name1.compareTo(name2)==0) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		
		if(name1.compareTo(name2)==1) {
			System.out.println("name1 is greater");
		}
		
		if(name1.compareTo(name2)==-1) {
			System.out.println("name2 is greater");
		}
	}
}