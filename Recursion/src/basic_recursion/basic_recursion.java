package basic_recursion;
public class basic_recursion{
	static int count=0;
	static void recurse() {
		if(count>10)return;
		System.out.println(count);
		count++;
		recurse();
	}
	public static void main(String[] args) {
		recurse();
	}
}