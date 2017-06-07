package day_5_15;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		
		Review sorting = new Review();
		int[] nums = { 7, 5, 2, 4, 2, 3, 5, 6, 7, 4 };
		
		sorting.ascending(nums);
		System.out.println(Arrays.toString(nums));

	}

	public int[] ascending(int[] nums) {

		int count = 1;
		int temp;

		while (count != 0) {

			count = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					count++;
				}
			}
		}

		return nums;
	}

}
