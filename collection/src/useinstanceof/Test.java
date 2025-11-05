package useinstanceof;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		//in angular brackets  primitives are not allowed only allowed their wrapper classes e.g.->Integer,Charact etc
		// writing wrapper class in angilsr bracket is generics
		List<String> namelist =new ArrayList<String>();
		namelist.add("mahesh");
		namelist.add("rajesh");
		namelist.add("mahi");
		namelist.add("surya");
		
		for(String name:namelist)
		{
			System.out.print(" "+name);
		}
		
	}
	
	
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(54);
		//a1.add("mahesh");
		
		
		// INHACENCE FOR LOOP IS ALSO CALLED AS EACH LOOP
		for(Integer i:a1)//for each integer i in a
		{
			System.out.print(i+" ");// in  this loop i work as object
		}
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<a1.size();i++)// in this loop i work as index
//		{
//			System.out.println(a1.get(i));
//		}

	}

}
