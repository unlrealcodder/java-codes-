package p3;
class Shape{
	String color;
	
	
	

	public void area() {
		System.out.println("display area");
	}
	
}// shape ends here

class Triangle extends Shape{
	
	
	
	
	

	public void area(int l,int h) {
		super.area();
		System.out.println(1/2+(l*h));
	}
}
public class Oops{
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.area(20,30);
	}
}