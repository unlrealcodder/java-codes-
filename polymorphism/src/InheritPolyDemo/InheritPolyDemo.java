package InheritPolyDemo;
class Person{
	String name;
	String city;
	int age;
	String gender;
	
	
	
	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getCity() {
		return city;
	}


	void setCity(String city) {
		this.city = city;
	}


	int getAge() {
		return age;
	}


	void setAge(int age) {
		this.age = age;
	}


	String getGender() {
		return gender;
	}


	void setGender(String gender) {
		this.gender = gender;
	}


	Person() {
		this.name = "not given";
		this.city = "not given";
		this.age = 0;
		this.gender = "not given";
	}
	
	
	Person(String name, String city, int age, String gender) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
	}
	
	void display() {
		System.out.println("\n Name is "+name);
		System.out.println("City is "+city);
		System.out.println("Age is "+age);
		System.out.println("Gender is "+gender);
	}	
}

class Employee extends Person{
	
	String designation;
	String company;
	
	
	
	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	Employee() {
		super();
		this.designation="not given";
		this.company="not given";
		
	}
	
	Employee(String name, String city, int age, String gender,String designation,String company) {
		super(name, city, age, gender);
		this.designation=designation;
		this.company=company;
	}

	@Override
	void display() {
		
		super.display();
		System.out.println("Designation is "+designation);
		System.out.println("Company is "+company);
	}
	
	
	
}
public class InheritPolyDemo{
	public static void main(String[] args) {
		
		Person p1=new Person("mahesh","barshi",22,"male");
		p1.display();
		
		p1=new Employee("mahesh","barshi",22,"male","developer","tcs");
		p1.display();
		
		Person p2=new Person();
		p2.setName("raj");
		//p2.name="raj";
		p2.display();
		
		Employee e1=new Employee();
		e1.setDesignation("ceo");
		e1.display();
		
	}
}