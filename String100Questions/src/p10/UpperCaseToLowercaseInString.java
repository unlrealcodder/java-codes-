package p10;

public class UpperCaseToLowercaseInString {

	public static void main(String[] args) {
		String name=new String("MAHESH VILAS CHIKHALE");
		String result="";
		char[]arr=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			if(arr[i]>='A'&& arr[i]<='Z') {
				result+= (char)(arr[i]+32);
			}
			else {
				result+=arr[i];
			}
		}
		System.out.println(result);

	}

}
