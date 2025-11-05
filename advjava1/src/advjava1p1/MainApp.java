package advjava1p1;

import java.util.ArrayList;
import java.util.List;



public class MainApp {

	public static void main(String[] args) {
		List<Person> people=new ArrayList();
		people.add(new Person(23,"Ritik","M"));
		people.add(new Person(23,"yogesh","M"));
		people.add(new Person(22,"lalana","F"));
		people.add(new Person(23,"Ankita","F"));

		// iterate over collection
		
		
		//make collection in linear
		//foreach function is terminal operation
		//people.stream().forEach(ref->System.out.println(ref.getName()));
		
		//filtering
		//people.stream().filter(ref->ref.getGender().equals("M")).forEach(xyz->System.out.println(xyz.getName()));;
	
		//average age of female members
		double avg=people.stream().filter(ref->ref.getGender().equals("F")).mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(avg);
	}
	}


