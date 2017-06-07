package day_5_10;

import java.util.Arrays;

public class Page215 {

	public static void main(String[] args) {

		int row = 4;
		int col = 3;
		int[][] nn = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				nn[i][j] = (i+1) * (j+1);
			}
		}

		for (int[] list : nn) {
			System.out.println(Arrays.toString(list));
		}

	}

}
