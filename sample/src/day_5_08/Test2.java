package day_5_08;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// �����ϼ���..
		// 1. ������ �Է�
		// 2. ȸ�� ��� ����
		// 3. ȸ�� ��ȸ
		// 4. ���α׷� ����
		// ����:

		Scanner sc = new Scanner(System.in);
		int select = 0;
		while (true) {
			System.out.println("�����ϼ���..");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ȸ�� ��� ����");
			System.out.println("3. ȸ�� ��ȸ");
			System.out.println("4. ���α׷� ����");
			System.out.print("����:");
			select = sc.nextInt();
//			if (select == 1) {
//				System.out.print("\n���� ������ �Է� : ");
//				int data = sc.nextInt();
//				System.out.println("\n�Էµ� �����ʹ� " + data + "�Դϴ�.");
//				break;
//			} else if (select == 2) {
//				System.out.println("\nlist");
//				break;
//			} else if (select == 3) {
//				System.out.println("\nsearch member");
//				break;
//			} else if (select == 4) {
//				System.out.println("\n���α׷��� �����մϴ�.");
//				break;
//			} else {
//				System.out.println("\n�ٽ� �Է��ϼ���.\n");
//			}

			switch (select) {
			case 1:
				System.out.print("\n���� ������ �Է� : ");
				int data = sc.nextInt();
				System.out.println("\n�Էµ� �����ʹ� " + data + "�Դϴ�.\n");
				break;
			case 2:
				System.out.println("\nlist");
				break;
			case 3:
				System.out.println("\nsearch member");
				break;
			case 4:
				System.out.println("\n���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("\n�ٽ� �Է��ϼ���.\n");
			}
		}
	}

}
