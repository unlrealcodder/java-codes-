package sort;
//using partition
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]number= {12,43,56,54,58,34,87};
        int arrlength=number.length;
        
        for(int i=0;i<arrlength-1;i++)
        {
        	int min=i;
        	for(int j=i;j<arrlength;j++)
        	{
        		if(number[j]<number[min])
        		{
        			min=j;
        		}
        	}
        	int temp=number[min];
        	number[min]=number[i];
        	number[i]=temp;
        }
        //used for display
        for (int k = 0; k < number.length; k++) {
        	
			System.out.print( number[k]+" ");
		}
	}

}
