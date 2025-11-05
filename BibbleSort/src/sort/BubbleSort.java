package sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] number = { 12, 43, 34, 56, 45, 87, 4 };

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					int tem = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tem;
				}//if
			}//for 2
		}//for 1
		for (int k = 0; k < number.length; k++) {
			System.out.print(" " + number[k]);
		}
	}
}
