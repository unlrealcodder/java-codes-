package p1;

import java.util.ArrayList;

public class MainApp{
	public static void main(String[] args) {
		//<Integer> -> is the type safe
		try {
			ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(1);
			list.add(23);
			list.add(233);
			
			System.out.println(list.get(0));
			System.out.println(list.size());
			
			//display list without iteration -> by using tostring method
			System.out.println(list);
			
			for(int i=0;i<list.size();i++) {
				System.out.println("list elements using loop "+list.get(i));
			}
			
			
			
			
			
			// forEach loop
			System.out.println(" ");
			for(int n:list) {
				System.out.println("using enhance loop"+n);
			}
			
			
			// this give true false value for the check content in the list
			System.out.println(list.contains(100));
			System.out.println(list.contains(1));
			
			// remove method -> remove element using index
			list.remove(1);
			System.out.println(list);
			
			// insert element at index
			list.add(1,50);
			System.out.println(list);
			
			
			//set at index -> replace the number at that index by removing it
			list.set(1, 30);
			System.out.println(list);
			
			// we can create list2 second and nth object for arraylist
			// can't do same for the array 
			//default capacity of internal array is 10 but we can initialize it 
			ArrayList<Integer> list2= new ArrayList<Integer>(11);
			list2.add(12);
			list2.add(32);
			System.out.println("list 2 is ->"+list2);
			
			//if we remove the element into the list then the arraylist is not shrink
			// we can shrink size using -> list.trimToSize();
			
			// this line cause exception
			System.out.println(list.get(4));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}