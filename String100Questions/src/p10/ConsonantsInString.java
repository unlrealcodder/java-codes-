package p10;

public class ConsonantsInString {

	public static void main(String[] args) {
		String name="mahesh vilas chikhale";
		char[]arr=name.toCharArray();
		//int VowelCount=0;
		int ConsonantCount=0;
		for(int i=0;i<name.length();i++) {
			if(arr[i]>='a'&&arr[i]<='z') {
				
			
			if(!(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')) {
				ConsonantCount++;
			}
				
			}
		}
          //System.out.println(VowelCount);
          System.out.println(ConsonantCount);
	}

}
