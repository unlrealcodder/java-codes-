package p2;




class Student {
	
	
	int id;
	String parent_name;
	// setters
	public void setId(int id) {
		this.id=id;
	}
	
	public void setParent_name(String pn) {
		this.parent_name=pn;
	}
	
	public void setN_Id(int i,String n){
		this.id=i;
		this.parent_name=n;
	}
	//getters
	
	public int getId()
	{
		return this.id;
	}
	
	public String getParent_name() {
		return this.parent_name;
	}
	
	public String getN_id() {
		return this.id+this.parent_name;
	}
	
	
	Student(){
		
	}
	
	Student(int id){
		this.id=id;
		
		System.out.println("third student constructor");
		System.out.println(this.getId());
	}
	
	Student(String parent_name){
		this.parent_name=parent_name;
		
		System.out.println("second student constructor");
		System.out.println(this.getParent_name());
	}
	
	Student(int id,String parent_name){
		this.id=id;
		this.parent_name=parent_name;
		
		System.out.println("third student constructor");
		System.out.println(this.id+this.parent_name);
	}
	
	
	
}

public class oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		
		s1.setId(12);
		
		s1.setParent_name("ram");
		// this step is overwriting the 12 and ram
		s1.setN_Id(13, "vijay");
		
			
		System.out.println(s1.getId());
		System.out.println(s1.getParent_name());
		System.out.println(s1.getN_id());
		
		
		

	}

}
