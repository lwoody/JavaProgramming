package day_5_18_temp;

import day_5_18.B;

public class C extends B {

	void print() {
		System.out.println(this.name);

		// protected ����
		System.out.println(this.name4);
	}

}

class CC extends B{
	B b = new B();
	
	void print() {
		System.out.println(b.name);

		// protected ����ȵ� - this���� �ȿ����� ���ǰ�, ���ο� ��ü ������ �޸𸮿� �ν��Ͻ� ���� �����ǹǷ� �ȵ�
		//System.out.println(b.name4);
	}
}
