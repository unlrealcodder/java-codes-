package p10;
public class PrintString{
	public static void main(String[] args) {
		
		//String str = "mahesh"; → Creates object in Heap → SCP area.

		//String str = new String("mahesh"); → Creates object in normal Heap, plus literal in SCP (if not present).
		
		String str ="mahesh";
		System.out.println(str);
		
		
		String str1 =new String("abhidnya");
		System.out.println(str1);
		
		
	}
}