package comparator1;

import java.util.ArrayList;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2-i1;    // for ascending order and      i2-i1 for descending order
	}
	
	
}






class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length()-s2.length();     // vice verssa for descending s2-s1               //s1.compareTo(s2)
	}
	
}
public class MainApp{
	public static void main(String[] args) {
		
		// sorted integers
		ArrayList<Integer> list= new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(2);
		list.add(99);
		
		list.sort(new MyComparator());
		System.out.println(list);
		
		
		// sorted  string 
		ArrayList<String> list1= new ArrayList<>();
		list1.add("animal");
		list1.add("bye");
		list1.add("ok");
		list1.add("cat");
		//list1.add("bat");
		
		list1.sort(new MyComparator1());
		System.out.println(list1);
		
		
		
		
		
		
		// sorting using lambda expression
		ArrayList<Integer>list3=new ArrayList<>();
		list3.add(23);
		list3.add(89);
		list3.add(900);
		
		list3.sort((a,b)->b-a);
		System.out.println("descending order is "+list3);
		
		
	}
}

