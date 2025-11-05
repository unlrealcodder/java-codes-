package classes;
class Student{
	int id;
	String name;
	
	void display() {
		System.out.println("ID: "+id+" \nNAME: "+name+"\n");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		student1.id=1;
		student1.name="mahesh";
		student1.display();
		
		Student student2=new Student();
		student2.id=2;
		student2.name="sumit";
		student2.display();
		
		
	}

}
