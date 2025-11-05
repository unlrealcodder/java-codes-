package maxelement;
public class Demo{
	public static void main(String[] args) {
		int[]array= {23,34,65,87,2};
		int res=Integer.MIN_VALUE;
		// using enhance lopp
		for(int i:array) {
			if(i>res) {
				res=i;
			}
		}
		System.out.println(res);
		
		//using indexed loop
		for(int i=0;i<array.length;i++) {
			if(array[i]>res) {
				res=array[i];
			}
		}
		System.out.println(res);
	}
}