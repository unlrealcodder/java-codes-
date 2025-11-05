package p1;
class Student
{
	String name;
	int age;
	// constructor is used for construct the object
	//destructor is not needed in java 
	//because java utilizes garbage collector for automatic memory management
	Student(){
		System.out.println("for default constructor");
		this.age=0;
		this.name="not given";
	}
	
	Student(int age,String name){
		System.out.println("\nfor parameterised constructor");
		this.age=age;
		this.name=name;
	}
	
	public void printinfo() {
		System.out.println(name+"\n"+age);
		System.out.println("\n"+this.name+" \n"+this.age);
	}
}
public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.printinfo();
		
		Student s2=new Student(23,"aman");
		s2.printinfo();
		
		

	}

}
