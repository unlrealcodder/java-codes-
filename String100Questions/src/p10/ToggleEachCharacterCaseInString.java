package p10;

public class ToggleEachCharacterCaseInString {

	public static void main(String[] args) {
		String name="Mahesh Vilas Chikhale 123";
		String result="";
		char[]arr=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if(arr[i]>='a'&&arr[i]<='z') {
				result+=(char)(arr[i]-32);
			}
			else if(arr[i]>='A'&&arr[i]<='Z') {
				result+=(char)(arr[i]+32);
			}
			else {
				result+=arr[i];
			}
		}
		System.out.println("original -> "+name);
		System.out.println("toggled -> "+result);

	}

}
