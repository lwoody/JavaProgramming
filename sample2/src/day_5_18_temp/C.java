package day_5_18_temp;

import day_5_18.B;

public class C extends B {

	void print() {
		System.out.println(this.name);

		// protected 적용
		System.out.println(this.name4);
	}

}

class CC extends B{
	B b = new B();
	
	void print() {
		System.out.println(b.name);

		// protected 적용안됨 - this영역 안에서만 허용되고, 내부에 객체 생성시 메모리에 인스턴스 따로 생성되므로 안됨
		//System.out.println(b.name4);
	}
}
