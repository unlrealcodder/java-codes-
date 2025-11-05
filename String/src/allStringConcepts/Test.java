package allStringConcepts;
public class Test{
	public static void main(String[] args) {
		//string (immutable)
		String s="hello";
		s=s+"world";
		
		// stringbuilder (mutable ,faster,synchronization)
		StringBuilder sb=new StringBuilder("hello");
		sb.append("world");
		
		// stringbuffer (mutable ,thread safe)
		StringBuffer sbf=new StringBuffer("hello");
		sbf.append("world");
		
		System.out.println(s);
		System.out.println(sb);
		System.out.println(sbf);
		
		
	}
}
