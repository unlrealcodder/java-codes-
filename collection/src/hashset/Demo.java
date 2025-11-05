package hashset;

import java.util.HashSet;

class Student 
{
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

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	System.out.println("inside hashcode");
		return this.roll;
	}

@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	System.out.println("inside the equals");
	Student s1=(Student)obj;
	if(this.roll==s1.roll)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	}
	

}
class Demo
{
    public static void main(String[]args)
    {
    HashSet<Student>hs1=new HashSet<Student>();
    hs1.add(new Student(18,"virat"));
    hs1.add(new Student(17,"virat"));
    hs1.add(new Student(187,"virat"));
    hs1.add(new Student(18,"virat"));
    
    if(hs1.contains(new Student(18 ,"virat")))
    {
    	System.out.println("found");
    }
    else
    {
    	System.out.println("not found");
    }
    
    //enhanced for loop
   /* for(Student s:hs1)
    {
    	System.out.println(s);
    }*/
    
    
    }
}
