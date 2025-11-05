package FullClass;

interface dancer
{
	void dance() ;
}

class Person{
	String name;
	int age;
	String gender;
	String city;
	
	
	
	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	int getAge() {
		return age;
	}



	void setAge(int age) {
//		if(age>=18)
		
			this.age = age;
		
		
		
	}



	String getGender() {
		return gender;
	}



	void setGender(String gender) {
		this.gender = gender;
	}



	String getCity() {
		return city;
	}



	void setCity(String city) {
		this.city = city;
	}



	Person() {
		
		System.out.println("\n default constructor is called \n");
		this.name = "not given";
		this.age = 0;
		this.gender = "not given";
		this.city = "not given";
	}
	
	
	
	Person(String name, int age, String gender, String city) {
		System.out.println("\n parametrised constructor called \n");
		this.name = name;
		setAge(age);
		this.gender = gender;
		this.city = city;
	}
	
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Gender is "+gender);
		System.out.println("City is "+city);
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
	Employee(String name, int age, String gender, String city,String designation,String company) {
		super(name, age, gender, city);
		this.designation=designation;
		this.company=company;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Designation is "+designation);
		System.out.println("Company is "+company);
	}
	
}
	class HumanRecruiter extends Employee implements dancer{
		int hired;

		int getHired() {
			return hired;
		}

		void setHired(int hired) {
			this.hired = hired;
		}

		HumanRecruiter() {
			super();
			this.hired=0;
		}

		HumanRecruiter(String name, int age, String gender, String city, String designation, String company,int hired) {
			super(name, age, gender, city, designation, company);
			this.hired=hired;
		}

		@Override
		void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Hired Employee "+hired);
		}

		@Override
		public void dance() {
			// TODO Auto-generated method stub
			System.out.println(" HR can dance ");
		}
		
		
		
		
	}
	

public class Test{
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.display();
		
		
		Person p2=new Person("mahesh",2,"male","pune");
		p2.display();
		
		
		Person p3;
		p3=new Employee();
		p3.display();
		
		Person p4;
		p4=new Employee("mahesh",22,"male","pune","ceo","tcs");
		p4.display();
		
		
		
		Employee e1;
		e1=new HumanRecruiter();
		e1.display();
		
		
		
		Employee e2;
		e2=new HumanRecruiter("sumit",21,"male","pune","ceo","tcs",100);
		e2.display();
		((HumanRecruiter)e2).dance();
		
				
	}
}