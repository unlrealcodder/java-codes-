	package inheritance;
// demo is the superclass
class Demo
{
	int fbid,distance;
	String name;
	
	
	int getFbid() {
		return fbid;
	}
	void setFbid(int fbid) {
		this.fbid = fbid;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	// default or zero parameterized constructor
	Demo() {
		
		System.out.println("demo default contructor called");
		this.fbid = 101;
		this.distance = 7;
		this.name = "not given\n";
	}
	
	// parameterized constructor
	
	Demo(int fbid, int distance, String name) {
		
		
		this.fbid = fbid;
		this.distance = distance;
		this.name = name;
	}
	
	// function 
	
	
	void display1()
	{
		System.out.println("This is using function display1");
		System.out.println("firstbit id is :"+fbid);
		System.out.println("distance is :"+distance);
		System.out.println("name is :" +name);
	}
	
}
// demo class ends here 

// in java extends keyword is used to implement the inheritance
// placeddemo is the subclass
class placeddemo extends Demo   // step 1
{
	String company;
	String desgn;
	placeddemo() {
		// when we use "super" that must first line of constructor
		//because object of superclass must initialised firstly
		super(); // step 2
		System.out.println(" placed demo default contructor called");
//		this.fbid = 101;
//		this.distance = 7;
//		this.name = "not given\n";
//		super is also used in default constructor of the placeddemo class
		
		this.company="not assigned";
		this.desgn="xyz";
	}
	
	placeddemo(int fbid, int distance, String name,String cname ,String d) {
		super(fbid, distance, name);// step 3
		//to represent super class in subclass "super" keyword used
		//that is constuctor of superclass is called with super keyword
		// TODO Auto-generated constructor stub
//		this.fbid=111;
//		this.name="firstbit solution";
//		this.distance=34;
		// line number 79,80,81  disturbing reuse 
		this.company=cname;
		this.desgn=d;
		
	}

	// generate setters and getters for the new attributes
	
	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getDesgn() {
		return desgn;
	}

	void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	
	// new function for new class
	
	void display1()
	{
//		System.out.println("\n This is using inherited function display1");
//		System.out.println("firstbit id is :"+fbid);
//		System.out.println("distance is :"+distance);
//		System.out.println("name is :" +name);
		//***** we use super.display() for the 115,16,17,18
		super.display1(); // step 4
		System.out.println("cmpany name is :"+this.company);
		System.out.println("designition is :"+this.desgn);
	}
	
	
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Demo d1;
//        d1=new Demo();
//        d1.display1();
        
//        Demo d2;
//        d2=new Demo();
//        d2.distance=12;
//        d2.fbid=13;
//        d2.name="rahul";
//        d2.display1();
        
        // here we creste objecct of sub class and that shows the is a relation 
        
        placeddemo ps1;
        // main note*** in inheritance whenever you create object of subclass internally 
        //object of superclass will be created
        
        // if we only create object hen it gives the values of demo class that shows 
        // is a realtionship with demo class
//        ps1=new placeddemo(18,800,"virat","rcb","open");
        ps1=new placeddemo();
       ps1.setFbid(18);
        ps1.setName("virat");
        ps1.setDistance(800);
        ps1.setCompany("rcb");
        ps1.setDesgn("opener");
        
        ps1.display1();
        
       
	}

}
