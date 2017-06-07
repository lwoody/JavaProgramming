package day_5_19;

class A {
	String name = "a";

	public A() {
		System.out.println("create A");
	}

	class B {
		public B() {
			System.out.println("create B");
		}

		void print() {
			System.out.println(name);
		}
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		// A a = new A();
		// outer.inner
		A.B b = new A().new B();
		b.print();
	}

}
