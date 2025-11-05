package p1;
class Student{
	String name;
	int age;
	
	void setName(String student_name) {
		this.name=student_name;
	}
	
	String getName() {
		return name;
	}
	
	void  setAge(int new_age) {
		this.age=new_age;
	}
	
	int getAge() {
		return age;
	}
}

public class Test{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("mahesh");
		System.out.println("name is -> "+s1.getName());
		
		s1.setAge(21);
		System.out.println("age is -> "+s1.getAge());
	}
}