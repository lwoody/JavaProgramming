package day_5_02;

import java.util.*;

public class Page142 {

	public static void main(String[] args) {
		// 점수를 학점으로 환산처리 (ABCDF)
		// 90이상 A,90-80 B,80-70 C,70-60 D,60미만 F

		int score = 0;
		char grade = 'F';

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("점수를 입력하시오.(0-100) : ");
			String s = sc.nextLine();
			score = Integer.parseInt(s);
			if (score >= 0 && score <= 100) {
				break;
			} else {
				System.out.println("유효하지 않은 점수입니다. 다시 입력해주세요.");
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

		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);

	}

}
