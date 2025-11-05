package p1;
class Student {
	static String college="KIT";
	int id;
	String name;
	
	static void changeCollege(String newcollege) {
		college=newcollege;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	
}

public class TestStatic{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=12;
		s1.name="mahesh";
		
		System.out.println("for kit before change");
		s1.display();
		//Student.changeCollege("coep");
		
		
		Student s2=new Student();
		s2.id=23;
		s2.name="anjali";
		System.out.println("for lit before change");
		s2.display();
		
		Student.changeCollege("COEP");
		
		System.out.println("for coep after change");
		s1.display();
		s2.display();
		
	}
}