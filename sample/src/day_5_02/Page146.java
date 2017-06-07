package day_5_02;

import java.util.Scanner;

public class Page146 {

	public static void main(String[] args) {
		
		char grade = 'F';
		int score=0;

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


		switch (score / 10) {
		case 9:
		case 10:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		}

		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		//난수 발생
		
		int randNum = (int) (Math.random()*10);
		System.out.println(randNum);
	}

}
