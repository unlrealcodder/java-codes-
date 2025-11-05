package p10;



public class StringConcatinationWithoutPlus {

	public static void main(String[] args) {
		String str1="mahesh";
		String str2="chikhale";
		
		String result=str1.concat(str2);
		System.out.println(result);
		
		
		
		String str3="sumit";
		String str4="jadhav";
		
		StringBuilder sb=new StringBuilder();
		sb.append(str3);
		sb.append(str4);
		
		String  res=sb.toString();
		System.out.println(res);
		
		// we can do using Stringbuffer also
		
		
		
		//joins->  String.join is static method inn java 8
		String res1=String.join("", str1,str2);
		System.out.println(res1);

	}

}
