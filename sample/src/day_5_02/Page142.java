package day_5_02;

import java.util.*;

public class Page142 {

	public static void main(String[] args) {
		// ������ �������� ȯ��ó�� (ABCDF)
		// 90�̻� A,90-80 B,80-70 C,70-60 D,60�̸� F

		int score = 0;
		char grade = 'F';

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("������ �Է��Ͻÿ�.(0-100) : ");
			String s = sc.nextLine();
			score = Integer.parseInt(s);
			if (score >= 0 && score <= 100) {
				break;
			} else {
				System.out.println("��ȿ���� ���� �����Դϴ�. �ٽ� �Է����ּ���.");
			}

		}

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		}

		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);

	}

}
