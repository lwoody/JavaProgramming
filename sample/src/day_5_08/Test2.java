package day_5_08;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 선택하세요..
		// 1. 데이터 입력
		// 2. 회원 목록 보기
		// 3. 회원 조회
		// 4. 프로그램 종료
		// 선택:

		Scanner sc = new Scanner(System.in);
		int select = 0;
		while (true) {
			System.out.println("선택하세요..");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택:");
			select = sc.nextInt();
//			if (select == 1) {
//				System.out.print("\n숫자 데이터 입력 : ");
//				int data = sc.nextInt();
//				System.out.println("\n입력된 데이터는 " + data + "입니다.");
//				break;
//			} else if (select == 2) {
//				System.out.println("\nlist");
//				break;
//			} else if (select == 3) {
//				System.out.println("\nsearch member");
//				break;
//			} else if (select == 4) {
//				System.out.println("\n프로그램을 종료합니다.");
//				break;
//			} else {
//				System.out.println("\n다시 입력하세요.\n");
//			}

			switch (select) {
			case 1:
				System.out.print("\n숫자 데이터 입력 : ");
				int data = sc.nextInt();
				System.out.println("\n입력된 데이터는 " + data + "입니다.\n");
				break;
			case 2:
				System.out.println("\nlist");
				break;
			case 3:
				System.out.println("\nsearch member");
				break;
			case 4:
				System.out.println("\n프로그램을 종료합니다.");
				return;
			default:
				System.out.println("\n다시 입력하세요.\n");
			}
		}
	}

}
