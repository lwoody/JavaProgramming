package Practice;

import java.util.Scanner;

public class WooJaeProb_5_11 {

	public static int abs(int num1, int num2) {
		return num1 > num2 ? num1 - num2 : num2 - num1;
	}

	public static String leftPad(String str, int size, char padChar) {

		int length = str.length();

		if (length >= size) {
			return str;
		} else {
			for (int i = 0; i < size - length; i++) {
				str = padChar + str;
			}
			return str;
		}

	}

	public static void main(String[] args) {

		// 문제1. 두 개의 숫자를 매개 변수로 받아서 두 숫자 사이의 차를 구하되,
		// 실행 결과가 음수일 경우 양의 정수로 변경하여 리턴하는 abs() 메서드를 구현하시오.
		// (단, 주어진 메서드의 시그니쳐는 변경하지 않는다.)

		Scanner sc = new Scanner(System.in);

		System.out.println("Problem 1.");
		System.out.print("first number  : ");
		int n1 = sc.nextInt();
		System.out.print("second number : ");
		int n2 = sc.nextInt();

		int result = WooJaeProb_5_11.abs(n1, n2);
		System.out.println("result        : " + result);

		// 문제2. Prob2내에 leftPad 메소드를 작성하십시오. leftPad 메소드의 속성은 다음과 같습니다.
		//
		// 1. 메소드 시그니처 : public String leftPad(String str, int size, char
		// padChar)
		// 2. 입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 문자열의 좌측을 지정된 문자(padChar)로 채운
		// 후 리턴한다.
		// 3. 단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 큰 경우에는 원본 문자열(str)을 그대로 리턴한다.
		//
		// 실행 예)
		// leftPad(“MDS”, 6, ‘#’)  ###MDS
		// leftPad(“MDS”, 5, ‘$’)  $$MDS
		// leftPad(“MDS”, 2, ‘&’)  MDS
		//
		//
		// 실행 결과 화면
		// ###MDS
		// $$MDS
		// MDS

		System.out.println("=======================");
		System.out.println("Problem 2.");
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.print("사이즈 입력 : ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.print("글자 입력   : ");
		char c = sc.nextLine().charAt(0);
		String result2 = WooJaeProb_5_11.leftPad(s, size, c);
		System.out.print("결과        : " + result2);

	}

}
