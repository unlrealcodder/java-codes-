package Factorial;

public class Sum_1_to_N_2nd {

	// this is the functional recursion
	static int Sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+Sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sum(4));
	}

}
