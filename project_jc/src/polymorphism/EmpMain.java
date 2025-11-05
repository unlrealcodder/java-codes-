package polymorphism;
class Employee
{
	String name;
	int id_no;
	int age;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getId_no() {
		return id_no;
	}
	void setId_no(int id_no) {
		this.id_no = id_no;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	
	Employee() {
		super();
		this.name = name;
		this.id_no = id_no;
		this.age = age;
	}
	
	
	
	
	
	Employee(String name, int id_no, int age) {
		super();
		this.name = name;
		this.id_no = id_no;
		this.age = age;
	}
	
	
	void display()
	{
		System.out.println("Employee name is -> "+name);
		System.out.println("Employee id is -> "+id_no);
		System.out.println("Employee age is -> "+age);
	}
	
	
}// employee class endds here 

class Hr extends Employee
{
	int hired;

	int getHired() {
		return hired;
	}

	void setHired(int hired) {
		this.hired = hired;
	}

	Hr() {
		super();
		// TODO Auto-generated constructor stub
	}

	Hr(String name, int id_no, int age,int h) {
		super(name, id_no, age);
		// TODO Auto-generated constructor stub
		this.hired=h;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Hired employees are -> "+hired+"\n");
	}
	
	
}// hr class ends here

class SaleMan extends Employee
{
	int target;

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	SaleMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	SaleMan(String name, int id_no, int age,int tar) {
		super(name, id_no, age);
		// TODO Auto-generated constructor stub
		this.target=tar;
	}
	
	void display()
	{
		super.display();
		System.out.println("Salesman targets are -> "+target+"\n");
	}
	
}// class hr ends here 
class Admin extends Employee
{
	String allowance;

	String getAllowance() {
		return allowance;
	}

	void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	Admin(String name, int id_no, int age,String allow) {
		super(name, id_no, age);
		// TODO Auto-generated constructor stub
		this.allowance=allow;
	}
	
	void display()
	{
		super.display();
		System.out.println("Employee is allowed or not -> "+allowance);
	}
	
}

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1; //generic reference
        e1=new Hr("shyam",123,22,100);//up casting
        e1.display();
        
        
        e1=new SaleMan("ram",124,23,52);
        e1.display();
        
    
        e1=new Admin("raj",120,26,"allowed");
        e1.display();
        
	}

}

