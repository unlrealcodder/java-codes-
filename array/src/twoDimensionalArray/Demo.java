package twoDimensionalArray;
public class Demo{
	public static void main(String[] args) {
		System.out.println("2 d array\n");
		int [][]nums=new int[3][2];
		
		nums[0][0]=1;
		nums[0][1]=2;
		nums[1][0]=3;
		nums[1][1]=4;
		nums[2][0]=5;
		nums[2][1]=6;
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\njagges array \n");
		//jagged array-> array[i].length is not the same for all
		//means each have different number of columns
		int brr[][]=new int[3][];
		
		brr[0]=new int[2];
		brr[1]=new int[3];
		brr[2]=new int[2];
		
		
		brr[0][0]=11;
		brr[0][1]=12;
		brr[1][0]=13;
		brr[1][1]=14;
		brr[1][2]=15;
		brr[2][0]=16;
		brr[2][1]=17;
		
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}