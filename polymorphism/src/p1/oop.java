package p1;
class Student {
	String name;
	int age;
	
	int id;
	String parent_name;
	
	
	
	// function overloading-> functions having same name
	public void printfInfo(String name) {
		System.out.println(name);
	}
	
	public void printfInfo(int age) {
		System.out.println(age);
	}
	
	public void printfInfo(String name,int age) {
		System.out.println(name+age);
	}
	
	
}

public class oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.printfInfo(12);
		s1.printfInfo("mahesh");
		s1.printfInfo("raj",20);
		
		System.out.println(" ");
		
     	Student s2=new Student();
    	s2.printfInfo("rajesh");
 		s2.printfInfo(29);
		

	}

}
