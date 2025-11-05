package staticclassNested;
// we can't make class directly static we need a nested class to make it static
class Outer{
	static class Inner{
		void show() {
			System.out.println("inside static nested class");
		}
	}
}

public class Test{
       public static void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
		obj.show();
		}
}