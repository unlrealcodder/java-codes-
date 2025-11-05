package p1;
//note-> stringbuilder contain array of character which have default capacity of 16 char
//if it fulls then new double size array of char is created and past values are shifted in it
public class Demo{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("tony");
		System.out.println(sb);
		
		
		//cahrAt
		for(int i=0;i<sb.length();i++) {
		System.out.println(sb.charAt(i));
		}
		
		sb.setCharAt(1, 'p');
		System.out.println(sb);
		
		sb.insert(3,'m');
		System.out.println(sb);
		
		// ending index is non-inclusive
		sb.delete(3, 4);
		System.out.println(sb);
		
		sb.append('i');
		System.out.println(sb);
		
		System.out.println("\nsubstring");
		String sub= sb.substring(0,2);
		System.out.println(sub);
		
		
		System.out.println(sb.length());
		
		
		
		//converting stringbuilder into string
		String newS= sb.toString();
		System.out.println(newS);
		
		
		System.out.println(newS.toUpperCase());
	}
}