
//stringbuffer is mutable sequence of characters 
//when you modify string java creates new object in memory,
//but stringbuffer avoids this modifying the same object saving memory and time


//-mutable
//-synchronized
//--slower than builder
//-Use StringBuffer when data changes a lot and multiple threads may access it.





package p1;
public class Test{
	public static void main(String[] args) {
		String name="mahesh";
		StringBuffer sb=new StringBuffer(name);
		sb.append('n');
		
		System.out.println(sb);
	}
}
