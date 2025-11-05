package p3;
class Pen{
	String type;
	String color;
	
	public void Write() {
		System.out.println("Writing something with "+color+" "+type+" pen");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
	
	
}// class pen ends
class Student{
	int age;
	String name;
	
	public void printInfo() {
		System.out.println(this.age);
		System.out.println(this.name);
	}
	//default constructor
	Student(){
		this.name="not given";
		this.age=0;
	}
	//constructor
	Student(String name,int  age){
		System.out.println("constructor is called");
		this.age=age;
		this.name=name;
	}
}
public class oops {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		// new keyword create memory for object on heap
		Pen pen1=new Pen();
		// we can assign 
		pen1.color="red";
		pen1.type="ballpoint";
		
		pen1.Write();

	}
	
	public static void main2(String[] args) {
		Pen pen1=new Pen();
		pen1.color="blue";
		
		Pen pen2=new Pen();
		pen2.color="red";
		
		// "this" keyword is helps that which object is calling
		pen1.printColor();
		pen2.printColor();
		
	}
	
	public static void main(String[] args) {
		//constructor is called at time of object creation
		Student s1=new Student("aman",23);
		s1.printInfo();
		
		//here only default constructor will be called
		Student s2=new Student();
		s2.printInfo();
		
	}

}
