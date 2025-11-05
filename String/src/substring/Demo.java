package substring;
public class Demo{
	public static void main(String[] args) {
		String sentence="my name is Mahesh";
		String name=sentence.substring(11, sentence.length());
		System.out.println(name);
		
		String uppercase=name.toUpperCase();
		System.out.println(uppercase);
	
		String lowercase=name.toLowerCase();
		System.out.println(lowercase);
	}
}