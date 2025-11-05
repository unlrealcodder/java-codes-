package polymorphism;
class Salary
{
	String name;
	int idno;
	int basic=5000;
    double salary;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getIdno() {
		return idno;
	}
	void setIdno(int idno) {
		this.idno = idno;
	}
	int getBasic() {
		return basic;
	}
	void setBasic(int basic) {
		this.basic = basic;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	Salary() {
		
		this.name = name;
		this.idno = idno;
		this.basic = basic;
		this.salary = salary;
		
	}
    
	Salary(String name, int idno, int basic, int salary) {
		
		this.name = name;
		this.idno = idno;
		this.basic = basic;
		this.salary = salary;
	}
    
    void DisplaySalary()
    {
    	salary=basic;
    	System.out.println("basic salary is -> "+salary+"Rs");
    }
    
	
	
}// salary class ends here 

class HrSalary extends Salary
{
    double comission =0.5;
    double hrsalary;
	double getComission() {
		return comission;
	}
	void setComission(double comission) {
		this.comission = comission;
	}
	double getHrsalary() {
		return hrsalary;
	}
	void setHrsalary(double hrsalary) {
		this.hrsalary = hrsalary;
	}
	HrSalary() {
		super();
		// TODO Auto-generated constructor stub
	}
	HrSalary(String name, int idno, int basic, int salary,double d,double d1) {
		super(name, idno, basic, salary);
		// TODO Auto-generated constructor stub
		this.comission=d;
		this.hrsalary=d1;
	}
    
	void DisplaySalary()
	{
		//super.DisplaySalary();
		hrsalary=(2*basic)+(0.5*basic);
		System.out.println("Hr salary is -> "+hrsalary+"Rs");
	}
    
}// hrsalary class ends here 

class AdminSalary extends Salary
{
	double adminsalary;
	int target;
	double getAdminsalary() {
		return adminsalary;
	}
	void setAdminsalary(double adminsalary) {
		this.adminsalary = adminsalary;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
	AdminSalary() {
		super();
		// TODO Auto-generated constructor stub
	}
	AdminSalary(String name, int idno, int basic, int salary,double as,int t) {
		super(name, idno, basic, salary);
		// TODO Auto-generated constructor stub
		this.adminsalary=as;
		this.target=t;
		
	}
	
	
	void DisplaySalary()
	{
		adminsalary=(2*basic)+(0.2*target*basic);
		System.out.println("Admin salary is -> "+adminsalary+"Rs");
	}
	
	
	
}

public class SalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s1;
		s1=new Salary();
		s1.DisplaySalary();
		
		s1=new HrSalary();
		s1.DisplaySalary();
		
		s1=new AdminSalary();
		s1.DisplaySalary();
		
	}

}
