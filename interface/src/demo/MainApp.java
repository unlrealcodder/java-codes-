package demo;
class Employee implements student{
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void work() {
		System.out.println(this.name+"is working");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"is studying");
	}
	
	
	
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee emp1=new Employee(1,"mahesh",34000);
         emp1.work();
         emp1.study();
         student s=new Employee(2,"vikas",2546);
         s.study();
         
         System.out.println(emp1);
	}

}
