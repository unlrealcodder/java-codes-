package p10;
public class SubStringCheck{
	public static void main(String[] args) {
		String str="java is programming ";
		String sub="programming";
		
		if(str.contains(sub)) {
			System.out.println("substring founds!");
		}
		else {
			System.out.println("substring not founds!");
		}
	}
}