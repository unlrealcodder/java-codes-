package p10;

public class LowerCaseToUpperCaseInString {

	public static void main(String[] args) {
		String name="mahesh vilas chikhale";
		String result="";
		char[]arr=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			
			if(arr[i]>='a'&&arr[i]<='z') {
				result+= (char)(arr[i]-32);
				
				//arr[i]-32 --->> gives the int.
				//m->109 ascii value so 109-32=77 which is the ascii of M
				//casting ensures that result is converted back to character from int.
			}
			
			else {
				result+=arr[i];
			}
		}
		System.out.println(result);

	}

}
