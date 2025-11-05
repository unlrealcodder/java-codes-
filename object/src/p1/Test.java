package p1;

public class Test {

	 int day;
	 //default 
	 Test()
	 {
		 this.day=0;
	 }
	 
//para
	public Test(int i) {
		// TODO Auto-generated constructor stub
		this.day=i;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "[day=" + day + "]";
	}
	
	void increment() {
		System.out.println(day++);
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int day;
		Test t1=new Test(12);
		//t1.display();
		System.out.println(t1);
		
		
		Test t2;
		t2=new Test(13);
		t2.increment();
		
		Test t3=new Test();// print zero due to value is not passed default int value is 0 always.
		System.out.println(t3);
		System.out.println("hashcode is ->"+t3.hashCode());
		
		
		String str="frf";
		str.length();
		
		

	}

}
