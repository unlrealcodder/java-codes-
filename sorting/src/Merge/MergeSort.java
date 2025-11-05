package Merge;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]number= {21,34,2,66,4,222,43,3,4};
		MergeSort app =new MergeSort();
		app.sort(app.number,0,app.number.length);
		app.dislpay(app.number);
public void sort(int[]ref,int left ,int middle,int right)
{
			if(left<right)
			{
				int middle=left+(right-left)/2;
				sort(number,left,middle);
				sort(number,middle+1,right);
				
				merge(number,left,middle,right);
				System.out.println(left+"" +middle+" "+right);
				display(number);
			}

	}
public void merge(int[]ref,int left,int right)
{
	
}

}
