package p2;

public class SetValue {

	int day;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set value without using constructor
		SetValue s1=new SetValue();
		s1.day=10;
		System.out.printf("%d\n",s1.day);
		
		s1.day=20;
		System.out.printf("%d\n",s1.day);
		
		
		
		SetValue s2=new SetValue();
		System.out.println(s2);
		
		s2.day=60;
		System.out.printf("%d",s2.day);
		
		
		
		
        
	}

}
