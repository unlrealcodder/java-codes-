package p10;

public class RverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String name1="ramesh";
		StringBuilder sb1=new StringBuilder(name1);
		System.out.println(sb1.reverse().toString());
		
		String name="mahesh vilas chikhale";
		StringBuilder sb=new StringBuilder(name);
		for(int i=0;i<sb.length()/2;i++) {
			int start=i;
			int end=sb.length()-1-i;
			
			char temp=sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			
		}
		System.out.println(sb);
		
		
		
		
		
		

	}

}
