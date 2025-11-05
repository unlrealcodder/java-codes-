package comparable;

import java.util.ArrayList;
import java.util.TreeSet;

public class Student implements Comparable{
int roll;
String name;
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + "]";
}
Student(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}


public static void main1(String[] args) {
	TreeSet<Student>studentlist=new TreeSet<Student>();
	studentlist.add(new Student(18,"virat"));
	studentlist.add(new Student(7,"dhoni"));
	studentlist.add(new Student(45,"rohit"));
	studentlist.add(new Student(10,"sachin"));
	
	
	/*for(Student s:studentlist)
	{
		System.out.println(s);
	}*/
	
	//search 
	if(studentlist.contains(new Student(18,"virat")))
	{
		System.out.println("found");
	}
	else
	{
		System.out.println("not found");
	}
}



public static void main(String[] args) {
	ArrayList<Student>studentlist=new ArrayList<Student>();
	studentlist.add(new Student(18,"virat"));
	studentlist.add(new Student(7,"dhoni"));
	studentlist.add(new Student(45,"rohit"));
	studentlist.add(new Student(10,"sachin"));
	
	
	for(Student s:studentlist)
	{
		System.out.println(s);
	}
	//search
	// as arraylist works on function equals
	// here equal function of object class works
	if(studentlist.contains(new Student(7,"dhoni")))
	{
		System.out.println("found");
	}
	else
	{
		System.out.println("not found");
	}
}



@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	System.out.println("in equals");
	    Student s1=(Student)obj;
	    if(s1.roll==this.roll)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}


@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	System.out.println("inside compareto ");// poc that treeset doesn't allow duplicate
	Student s2= (Student)o; //down casting to solve up casting
	return this.roll-s2.roll ;//s2 take object using down cast
	// internally reference of s1 pass in this keyword
	
}


}



