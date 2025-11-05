package p1;
class Employee{
	String name;
	int age;
	double salary;
	String designation;
	
	Employee(){
		this.name=null;
		this.age=0;
	}

	
	Employee(String new_name,int new_age){
		this.name=new_name;
		this.age=new_age;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	void setSalary(double new_salary) {
		this.salary=new_salary;
	}
	
	double getSalary() {
		return salary;
	}
	
	
	
	
	

	
	
	
	
}

public class withoutSttersGetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee s1=new Employee("mahesh",21);
		System.out.println(s1);
		
		
		s1.setSalary(2000);
		System.out.println("salary is -> "+s1.getSalary());
		
		s1.designation="software engineer";
		System.out.println("designation is -> "+s1.designation);
		
	}

}
