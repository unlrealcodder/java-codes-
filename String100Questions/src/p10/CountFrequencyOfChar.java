package p10;

public class CountFrequencyOfChar {

	public static void main(String[] args) {
		   String str="mahesh";
		   char arr[]=str.toCharArray();
		   
		   for(int i=0;i<str.length();i++) {
			   int count =0;
			   boolean alreadyCounted=false;
			   
			   for(int k=0;k<i;k++) {
				   if(arr[i]==arr[k]) {
					   alreadyCounted=true;
					   break;
				   }
			   }//second for
			   if(alreadyCounted) {
				   continue;
			   }
			   
			   
			   for(int j=0;j<str.length();j++) {
				   if(arr[i]==arr[j]) {
					   count++;
				   }
			   }// third for
			   System.out.println("charater "+arr[i]+" repeated "+count+" times");
		   }// first for

	}

}

