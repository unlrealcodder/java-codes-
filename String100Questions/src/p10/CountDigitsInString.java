package p10;

public class CountDigitsInString {

	public static void main(String[] args) {
		String name="mahesh1287nfdfgh2jhkfd";
		char[]arr=name.toCharArray();
		int digitCount=0;
		for(int i=0;i<name.length();i++) {
			if(arr[i]>='0'&&arr[i]<='9') {
				digitCount++;
			}
		}
		System.out.println("total digits in string are "+digitCount);

	}

}
