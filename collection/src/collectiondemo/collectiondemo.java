package collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
//import java.util.List;

public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is for arraylist");
		ArrayList a1=new ArrayList();
		//List a1=new ArrayList();// this is using upcasting
		
		
		a1.add(10);// in this function objects can pass like class date ,emp etc USING UPCASTING
		//if we waNT TO GET IT THEN THEY ARE IN OBJECT FORM THEN WE HAVE TO PERFORM DOWN CASTING
		//DOWN CASTING GIVES THE EXCEPTION CLASSCAST EXCEPTION 
		// TO AVOID CLASSCAST EXCEPTION USE INSTANCE OF
		
		a1.add("mahesh");
		a1.add(23);
		a1.add(7);
		a1.add(45);
		a1.add(18);
		
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		LinkedList l1=new LinkedList();
		// List l1=new LinkedList(); this is using upcasting
		System.out.println("\nthis is for linkedlist\n");
		l1.add(12);
		l1.add("mahesh");
		
		for(int j=0;j<l1.size();j++)
		{
			System.out.println(l1.get(j));
		}
		
		System.out.println("this is for treeset");
		TreeSet t1=new TreeSet();
		t1.add(5);
		t1.add(23);
		t1.add(7);// if we pass string here then it gives classcast exception
		t1.add(45); 
		t1.add(18);
		System.out.println("we get sorted numbers"+t1);
		

	}

}
