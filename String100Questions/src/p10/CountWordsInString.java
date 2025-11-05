package p10;

public class CountWordsInString {

	public static void main(String[] args) {
		String name=" mahesh vilas chikhale    fm  ";
		char[]arr=name.toCharArray();
		int wordsCount=0;
		boolean inWord=false;// to track we are inside word
		for(int i=0;i<name.length();i++) {
			if(arr[i]!=' '&& !inWord) {
				inWord=true;// we are in word
				wordsCount++;
			}
			else if(arr[i]==' '){
				inWord=false;// we are not in word
			}
		}
		System.out.println("word count is -> "+wordsCount);

	}

}
