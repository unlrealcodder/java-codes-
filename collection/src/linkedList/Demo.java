package linkedList;

import java.util.LinkedList;

public class Demo{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(122);
		l1.add(123);
		l1.add(124);
		l1.add(125);
		
		l1.remove(Integer.valueOf(124));
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
	}
}