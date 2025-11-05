package p2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp{
	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	System.out.println(list.getClass().getName());
	
	
	List<String> list1=Arrays.asList("monday","tuesday");
	System.out.println(list1.getClass().getName());
	//we can replace but can't add ,remove
	list1.set(1, "wednesday");
	System.out.println(list1.get(1));
	
	
	String[]array= {"apple","banana"};
	List<String>list2=Arrays.asList(array);
	System.out.println(list2.getClass().getName());
	
	
	
	ArrayList<Integer>demo=new ArrayList<>();
	demo.add(23);
	demo.add(54);
	demo.add(12);
	System.out.println("demo list"+demo);
	
	// immutable collection
	List<Integer> list3= List.of(1,2,3,4);
	System.out.println(list3);
	//list3.set(1, 9); -> unsupported operation exception due to immutable collection
	demo.addAll(list3);
	System.out.println("adding list3 to demo"+demo);
	
	//creating arrayList from another collection
	List<String>anotherList=Arrays.asList("apple","banana","orange");
	System.out.println(anotherList);
	ArrayList<String>listFromCollection=new ArrayList<>(anotherList);
	System.out.println(listFromCollection);
	
	
	listFromCollection.remove(0);
	System.out.println(listFromCollection);
	listFromCollection.remove("orange");
	System.out.println(listFromCollection);
	
	
	ArrayList<Integer>nums=new ArrayList<>(list3);
	System.out.println(nums);
	
	nums.remove(0);// -> nums.remove(index);
	System.out.println("remove the element using index"+nums);
	
	nums.remove(Integer.valueOf(4));// integer 4 is removed like  nums.remove(object);
	System.out.println("remove the element using object"+nums);
	
	// sort list
	ArrayList<Integer> num2=new ArrayList<>(demo);
	Collections.sort(num2);
	System.out.println("sorted list is -> "+num2);
	}
}