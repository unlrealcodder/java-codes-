package emp;

public class Employee {
int id;
String name;
double salary;
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
Employee() {
	super();
	// TODO Auto-generated constructor stub
	this.id = id;
	this.name = name;
	this.salary = salary;
}
Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}// employee ends here 

class Test1{
	public static void main(String[]args) {
		Employee e1=new Employee(12,"mahesh",23343);
		System.out.println(e1);
		
		
	}
}
