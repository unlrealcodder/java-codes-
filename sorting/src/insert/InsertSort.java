package insert;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []number= {12,23,45,69,2,3,5};
	
	int arrlength=number.length;
	//outer counter for the unsorted area
	for(int i=1;i<arrlength;i++)
	{
		int comparevalue=number[i];
		//inner counter is for sorted area
		
		int j=i-1;
		while(j>=0&&number[j]>comparevalue)
		{
			number[j+1]=number[j];
			j--;
		}
		number[j+1]=comparevalue;
		for(int value:number)
		{
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	}
	

}
