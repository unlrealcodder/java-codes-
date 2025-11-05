package PolyWithInterface;
interface Shape{
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("draw circle");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("draw rectangle");
	}
}
public class ShapeTest{
	public static void main(String[] args) {
		Shape s1;
		
		s1=new Circle();
		s1.draw();
		
		s1=new Rectangle();
		s1.draw();
	}
}