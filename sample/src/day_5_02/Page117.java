package day_5_02;

import java.util.*;

public class Page117 {

	public static void main(String[] args) {
		// ch ���� ���ڰ��� �������� �ƴ��� �Ǻ� ���

		Scanner sc = new Scanner(System.in);

		System.out.println("Ű���带 �̿��� ���� �Է��Ͻÿ�.");
		String s = sc.nextLine();
		char ch;
		ch = s.charAt(0);

		if (Character.isDigit(ch)) {
			System.out.println(ch + "�� ���� �Դϴ�.");

		} else {
			System.out.println(ch + "�� ���ڰ� �ƴմϴ�.");

		}
		
		System.out.println("===========");
		boolean isnum=true;
		
		for(int i=0;i<s.length();i++){
			ch = s.charAt(i);
			if (!Character.isDigit(ch)) {
				isnum=false;
				break;
			}
	
		}
		
		if(isnum) System.out.println(s + "�� ���� �Դϴ�.");
		else System.out.println(s + "�� ���ڰ� �ƴմϴ�.");

	}

}
