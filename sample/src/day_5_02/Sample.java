package day_5_02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// Ű����� ���� �������� �Է� �޴´�.
		// �� ������ ��� �빮�ڷ� �ٲٰ�
		// �յ� ������ �ٲ۴�.
		// ex) java -> JAVA -> AVAJ

		System.out.println("���� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}

		System.out.println(result);

	}

}
