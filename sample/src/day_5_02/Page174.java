package day_5_02;

import java.util.*;

public class Page174 {

	final static int answer = (int) (Math.random() * 100);
	static int count=0;

	public static void main(String[] args) {

		while (true) {
			System.out.print("0과 100 사이의 정수를 입력하세요.>");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			int input = Integer.parseInt(s);

			if (input == answer) {
				count++;
				System.out.println(answer+" 정답입니다. 시도 : "+count);
				break;
			} else if (input < answer) {
				System.out.println("더 큰 값으로 다시 시도해보세요.");
				count++;
			} else {
				System.out.println("더 작은 값으로 다시 시도해보세요.");
				count++;
			}
		}

	}

}
