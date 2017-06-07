package Practice;

import java.util.Arrays;

public class WooJaeDay_5_8 {

	// ==== 다음 코드를 완성한후 제출하세요 =====
	//
	// Prob1. Prob1 클래스의 main() 에서
	// 주어진 문자열 배열을 생성하여 배열의 내용을 역순으로 출력하할 수 있도록
	// main 메서드를 작성하세요.
	//
	// - 문자열 배열의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 출력한다.
	// - 입력으로 주어진 문자열 배열의 예 :
	// { "Java Programming" , "JDBC", "Oracle11g", "JSP/Servlet" }
	//
	//
	// 처리 결과의 예 : 아래 참고.
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

		// 1.arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오 .
		//
		// class Exercise2 {
		// public static void main(String[] args) {
		// int[] arr = {10, 20, 30, 40, 50};
		//
		// // TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		//
		// System.out.println("sum="+sum);
		// }
		// }
		//
		//
		// 2. 주어진 일차원 배열의 내용을 내림차순으로 정렬하는 로직을 작성하시오.
		// (단, 로직은 main() 메서드에 작성하고 반드시 이중 for문을 사용하여 구현해야 한다.)
		//
		//
		// [배열의 내용]
		// 3, 24, 1, 55, 17, 43, 5
		// [클래스 실행결과]
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
