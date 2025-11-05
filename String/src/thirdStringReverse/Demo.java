package thirdStringReverse;
public class Demo{
	public static void main(String[] args) {
		String str="123";
		String str1="456";
		
		//new Stringbuilder(str).reverse -> return string builder
		//tostring converrts it into to the string not stringbuilder
		StringBuilder sb=new StringBuilder(str).reverse();
		System.out.println("usinng stringbuilder"+sb);
		
		String reverse=new StringBuilder(str1).reverse().toString();
		System.out.println("using string "+reverse);
		
		
		
		String[] num= {"123","567","789"};
		for(int i=0;i<num.length;i++) {
			num[i]=new StringBuilder(num[i]).reverse().toString();
		}
		System.out.println("\n using string array");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		
		// string array converting to char array 
		String[]num1= {"apple","orange","mahesh"};
		
		for(int i=0;i<num1.length;i++) {
		char[] ch=num1[i].toCharArray();
		
		System.out.print(num1[i]+"->");
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		}
		
		
		// reverse
		System.out.println("\nreverse");
		for(int i=0;i<num1.length;i++) {
			char[] ch=num1[i].toCharArray();
			System.out.print(num1[i]+"->");
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]+" ");
			}
			System.out.println();
			}
		
		
		
		
		
		
		
	}
}