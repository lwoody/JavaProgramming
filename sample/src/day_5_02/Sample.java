package day_5_02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// 키보드로 부터 영문장을 입력 받는다.
		// 그 문장을 모두 대문자로 바꾸고
		// 앞뒤 순서를 바꾼다.
		// ex) java -> JAVA -> AVAJ

		System.out.println("영어 문장을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}

		System.out.println(result);

	}

}
