package advjava1p1;
public class Person{
	int age;
	String name;
	String gender;
	
	
	Person() {
		
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	
	Person(int v1, String v2, String v3) {
	
		this.age = v1;
		this.name = v2;
		this.gender = v3;
	}


	int getAge() {
		return age;
	}


	void setAge(int age) {
		this.age = age;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getGender() {
		return gender;
	}


	void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}