package p2;
// static method can be called without calling the object
class MathUtils{
	static int square(int x) {
		return x*x;
	}
}
public class Test{
	public static void main(String[] args) {
		System.out.println("square of 5 is : "+MathUtils.square(5));
	}
}