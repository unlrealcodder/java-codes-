package arrayList;

import java.util.ArrayList;

public class Demo{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("mahesh");
		a1.add("sumit");
		a1.add("raj");
		a1.add("vishakkha");
		
		a1.remove(String.valueOf("sumit"));
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		
		ArrayList l2=new ArrayList();
		l2.add("\nvishu");
		l2.add("ram");
		l2.add("shyam");
		
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
	}
}