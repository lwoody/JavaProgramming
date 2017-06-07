package day_5_18_temp;

import day_5_18.A;

public class Test_01 {

	public static void main(String[] args) {

		// import 된 패키지의 클래스가 우선순위로 생성됨
		A a = new A();
		System.out.println(a.name);

		// 자신이 속한 패키지에 있는 클래스로 인스턴스 생성함
		day_5_18_temp.A temp = new day_5_18_temp.A();

	}

}
