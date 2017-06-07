package day_5_02;

import java.util.*;

public class Page117 {

	public static void main(String[] args) {
		// ch 변수 문자값이 숫자인지 아닌지 판별 기능

		Scanner sc = new Scanner(System.in);

		System.out.println("키보드를 이용해 값을 입력하시오.");
		String s = sc.nextLine();
		char ch;
		ch = s.charAt(0);

		if (Character.isDigit(ch)) {
			System.out.println(ch + "는 숫자 입니다.");

		} else {
			System.out.println(ch + "는 숫자가 아닙니다.");

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
		
		if(isnum) System.out.println(s + "는 숫자 입니다.");
		else System.out.println(s + "는 숫자가 아닙니다.");

	}

}
