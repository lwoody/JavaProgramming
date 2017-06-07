package day_5_08;

import java.util.Arrays;

public class Page186 {

	public static void main(String[] args) {

		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println(Arrays.toString(num));

		int[] num2 = new int[num.length * 2];
		System.arraycopy(num, 0, num2, 0, num.length);
		for (int data : num2) {
			System.out.print(data + "\t");
		}
		System.out.println(Arrays.toString(num2));

		int[] num3 = new int[num.length * 2];
		System.arraycopy(num, 0, num3, 0, num.length - 1);
		System.out.println(Arrays.toString(num3));

	}

}
