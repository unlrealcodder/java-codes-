package map;

import java.util.*;
class MyKey implements Comparable
{
	int key;

	MyKey(int key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "MyKey is" + key + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyKey m1=(MyKey)o;
		return this.key-m1.key;
		
	}
	
}
class Employee
{
	int id;
	String name;
	double salary;
	@Override
	public String toString() {
		return " Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
public class DemoMap {
	public static void main(String[] args) {
		
		//m1.put(45,new Employee(45,"rohit",2000));
		Employee e1=new Employee(45,"rohit",2000);
		Employee e2=new Employee(7,"dhoni",2100);
		Employee e3=new Employee(10,"sachin",32000);
		Map m1=new TreeMap<MyKey, Employee>();
		
		m1.put(new MyKey(45), e1);
		m1.put(new MyKey(7), e2);
		m1.put(new MyKey(10), e3);
		
		System.out.println(m1);
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("demo map");
		Map m1=new TreeMap<Integer,String>();
		m1.put(45, "rohit");
		m1.put(7, "dhoni");
		m1.put(10, "sachin");
		
		System.out.println(m1);

	}

}
