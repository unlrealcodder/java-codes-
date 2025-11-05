package arrayprac;

import java.util.Iterator;
class employee{
	int id ;
	String name;
    double salary;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	employee(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	employee() {
		
		// TODO Auto-generated constructor stub
		this.id = 10;
		this.name = "not given";
		this.salary = 20;
	}
	
	void display() {
		System.out.println("id="+ + id +"\n" + "name=" + name+"\n" + "salary=" + salary+"\n" );
	}
	
	
	
	

    
    
    
     
    
}


public class test {

	public static void main(String[] args) {// jvm is only search of main() which iis entry point so it execute first
		main1(args);//main1 become ordinary function
		employee[] arrEmp;// reffere is created on stack
		arrEmp= new employee[3];//array of reference is created on heap
		arrEmp[0]=new employee(1,"virat",20000);
	//	arrEmp[1]=new employee(2,"rohit",30000); at that time null pointer exception occurs at runtime
		arrEmp[2]=new employee(1,"dhoni",40000);
		
		for (int i = 0; i < arrEmp.length; i++) {
			//arrEmp[i].display();
			System.out.println(arrEmp[i]);// to prove null pointer exception we prove usinng hashcode
			System.out.println();
		}
		
		
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		//array of integers is created on the heap 
        int [] arr=new int[5];
        
       // this is initializATION OF ARRAY
        //int [] arr= {1,2,3,4,5};
        System.out.println("length of array is :"+arr.length);
        
        arr[0]=10;
        arr[1]=0;
        arr[2]=210;
        arr[3]=120;
        arr[4]=104;
        
        
        
        for (int i = 0; i < arr.length; i++) {
			System.out.println("array elements are :"+arr[i]+"\n");
		}
        
        
	}

}
