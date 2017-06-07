package day_5_08;

import java.util.Arrays;

public class Page197 {

	public static void main(String[] args) {

		// max and min
		int[] num = { 66, 77, 100, 99, 55 };
		
		int max = num[0];
		int min = num[0];

		for (int data : num) {
			if (data > max) {
				max = data;
			} else if (data < min) {
				min = data;
			}
		}

		System.out.println("min = " + min);
		System.out.println("max = " + max);

		int[] num2 = { 12, 3, 421, 34, 1, 24, 21, 4, 42, 1421, 42, 4 };
		int[] src = num2;

		for (int data : num2) {
			max = Math.max(data, max);
			min = Math.min(data, min);
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		int temp;
		
		
		// sort
		final long startTime = System.nanoTime();		
		for (int i = 0; i < num2.length; i++) {
			for (int j = i + 1; j < num2.length; j++) {
				if (num2[i] > num2[j]) {
					temp = num2[i];
					num2[i] = num2[j];
					num2[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(num2));
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);

		// bubble sort
		final long startTime2 = System.nanoTime();
		int[] num3 = { 12, 3, 421, 34, 1, 24, 21, 4, 42, 1421, 42, 4 };
		int flag = 0;
		while (flag == 0) {
			flag = 1;
			for (int i = 0; i < num3.length - 1; i++) {
				if (num3[i] > num3[i + 1]) {
					temp = num3[i];
					num3[i] = num3[i + 1];
					num3[i + 1] = temp;
					flag = 0;
				}
			}

		}
		System.out.println(Arrays.toString(num3));
		final long duration2 = System.nanoTime() - startTime2;
		System.out.println(duration2);

		// selection sort
		final long startTime3 = System.nanoTime();
		int[] num4 = { 12, 3, 421, 34, 1, 24, 21, 4, 42, 1421, 42, 4 };
		int minimum;
		int index;
		for (int i = 0; i < num4.length; i++) {

			minimum = num4[i];
			index = i;
			for (int j = i + 1; j < num4.length; j++) {
				if (minimum > num4[j]) {
					minimum = num4[j];
					index = j;
				}
			}

			temp = num4[i];
			num4[i] = num4[index];
			num4[index] = temp;

		}

		System.out.println(Arrays.toString(num4));
		final long duration3 = System.nanoTime() - startTime3;
		System.out.println(duration3);
		
		System.out.println(Arrays.toString(src));
	}
}
