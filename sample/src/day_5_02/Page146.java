package day_5_02;

import java.util.Scanner;

public class Page146 {

	public static void main(String[] args) {
		
		char grade = 'F';
		int score=0;

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

		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);
		
		//���� �߻�
		
		int randNum = (int) (Math.random()*10);
		System.out.println(randNum);
	}

}
