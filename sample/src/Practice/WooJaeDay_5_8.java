package Practice;

import java.util.Arrays;

public class WooJaeDay_5_8 {

	// ==== ���� �ڵ带 �ϼ����� �����ϼ��� =====
	//
	// Prob1. Prob1 Ŭ������ main() ����
	// �־��� ���ڿ� �迭�� �����Ͽ� �迭�� ������ �������� ������� �� �ֵ���
	// main �޼��带 �ۼ��ϼ���.
	//
	// - ���ڿ� �迭�� ������ �������� ����ϵ� �� ���ڿ� ���� �������� ����Ѵ�.
	// - �Է����� �־��� ���ڿ� �迭�� �� :
	// { "Java Programming" , "JDBC", "Oracle11g", "JSP/Servlet" }
	//
	//
	// ó�� ����� �� : �Ʒ� ����.
	// gnimmargorP avaJ
	// CBDJ
	// g11elcarO
	// telvreS/PSJ

	public static void main(String[] args) {

		String[] list = { "Java Programming", "JDBC", "Oracle11g", "JSP/Servlet" };

		for (int i = 0; i < list.length; i++) {

			String temp = "";
			for (int j = list[i].length() - 1; j >= 0; j--) {
				temp += list[i].charAt(j);
			}
			System.out.println(temp);
		}

		// 1.arr �迭 �� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ� .
		//
		// class Exercise2 {
		// public static void main(String[] args) {
		// int[] arr = {10, 20, 30, 40, 50};
		//
		// // TODO arr �迭 �� ��� ��� ���� ���ϴ� ���α׷��� �ϼ�
		//
		// System.out.println("sum="+sum);
		// }
		// }
		//
		//
		// 2. �־��� ������ �迭�� ������ ������������ �����ϴ� ������ �ۼ��Ͻÿ�.
		// (��, ������ main() �޼��忡 �ۼ��ϰ� �ݵ�� ���� for���� ����Ͽ� �����ؾ� �Ѵ�.)
		//
		//
		// [�迭�� ����]
		// 3, 24, 1, 55, 17, 43, 5
		// [Ŭ���� ������]
		// 55, 43, 24, 17, 5, 3, 1

		// 1.

		System.out.println("==========");
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int data : arr) {
			sum += data;
		}
		System.out.println("sum=" + sum);

		// 2.
		System.out.println("==========");
		int[] arr1 = { 3, 24, 1, 55, 17, 43, 5 };
		int[] arr2 = { 4, 5, 43, 2, 654, 3, 432, 3, 433, 34 };

		arr1 = sorting(arr1);
		arr2 = sorting(arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	static public int[] sorting(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] < arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		return arr1;
	}

}
