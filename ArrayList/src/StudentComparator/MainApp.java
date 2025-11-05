package StudentComparator;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
	String name;
	double gpa;
	
	Student(String name,double gpa){
		this.name=name;
		this.gpa=gpa;
	}

	String getName() {
		return name;
	}

	double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]\n";
	}
	
	
}// student ends here


public class MainApp{
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("mahesh",10));
		list.add(new Student("sumit",6.3));
		list.add(new Student("caj",10));
		System.out.println("before sorting");
		System.out.println(list);
		// using lambda expression sort by gpa
		list.sort((o1,o2)->{
			if(o2.getGpa()-o1.getGpa()>0) {
				return 1;
			}
			else if(o2.getGpa()-o1.getGpa()<0) {
				return -1;
			}
			else {
				return 0;
			}
		});
		System.out.println("after sorting with gpa");
		System.out.println(list);
		
		// we can print using index
		//System.out.println(list.get(0));
		
		
		
		
		
		System.out.println("compare by predefined function\n");
		// sorting according to gpa ascending order using predefine static method 
		// when we use reverse  the list in reverse of the sorted by gpa list-> means we made list descending
		//then compare according to name
		Comparator<Student>com=Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		list.sort(com);
		for(Student n:list) {
			System.out.println(n);
		}
		
		
	}
}