package day_5_15;

import java.util.Scanner;

public class Clac {

	public static double exec(char symbol, double... nums) {
		double result = 0;

		switch (symbol) {
		case '+':
			result = addition(nums);
			break;

		case '-':
			result = nums[0] * 2;
			for (double data : nums) {
				result -= data;
			}
			break;

		case '*':
			result = 1;
			for (double data : nums) {
				result *= data;
			}
			break;
		case '/':
			result = nums[0] * nums[0];
			for (double data : nums) {
				result /= data;
			}
			break;
		}

		// if (symbol == '+') {
		// double sum = 0;
		// for (double data : nums) {
		// sum += data;
		// }
		// return sum;
		// } else if (symbol == '-') {
		// result = nums[0] * 2;
		// for (double data : nums) {
		// result -= data;
		// }
		// return result;
		// } else if (symbol == '*') {
		// result = 1;
		// for (double data : nums) {
		// result *= data;
		// }
		// return result;
		// } else if (symbol == '/') {
		// result = nums[0] * nums[0];
		// for (double data : nums) {
		// result /= data;
		// }
		// return result;
		// }

		return result;
	}

	public static int addition(int n1, int n2) {
		return n1 + n2;
	}

	public static double addition(double n1, double n2) {
		return n1 + n2;
	}

	// public static int addition(int[] a){
	// int sum=0;
	// for(int data : a){
	// sum+=data;
	// }
	// return sum;
	// }

	public static double addition(double... list) {
		double sum = 0;
		for (double data : list) {
			sum += data;
		}

		return sum;
	}

	public static int subtract(int n1, int n2) {
		return n1 > n2 ? n1 - n2 : n2 - n1;
	}

	public static int divide(int n1, int n2) {
		return n1 > n2 ? n1 / n2 : n2 / n1;
	}

	public static int multiply(int n1, int n2) {
		return n1 * n2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 두개 입력하세요.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		double[] arr2 = { 5, 6, 7, 8 };

		System.out.printf("addition : %d %n", Clac.addition(n1, n2));
		System.out.printf("subtract : %d %n", Clac.subtract(n1, n2));
		System.out.printf("divide   : %d %n", Clac.divide(n1, n2));
		System.out.printf("multiply : %d %n", Clac.multiply(n1, n2));
		System.out.printf("double addition : %f %n", Clac.addition(5.5, 7.7));
		System.out.printf("double addition : %f %n", Clac.exec('*'));

		sc.close();

	}

}