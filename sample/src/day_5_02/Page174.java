package day_5_02;

import java.util.*;

public class Page174 {

	final static int answer = (int) (Math.random() * 100);
	static int count=0;

	public static void main(String[] args) {

		while (true) {
			System.out.print("0�� 100 ������ ������ �Է��ϼ���.>");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			int input = Integer.parseInt(s);

			if (input == answer) {
				count++;
				System.out.println(answer+" �����Դϴ�. �õ� : "+count);
				break;
			} else if (input < answer) {
				System.out.println("�� ū ������ �ٽ� �õ��غ�����.");
				count++;
			} else {
				System.out.println("�� ���� ������ �ٽ� �õ��غ�����.");
				count++;
			}
		}

	}

}
