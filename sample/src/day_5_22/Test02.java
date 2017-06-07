package day_5_22;

public class Test02 {

	public static void main(String[] args) {
		Outer.A1 a = new Outer().new A1();
		a.print();

		Outer out = new Outer();
		out.printOuter();

	}

}

class Outer {
	String name = "Outer";

	public Outer() {
		System.out.println("create outer");
	}

	void test() {
		new A1().print();
	}

	class A1 {
		String name = "A1";

		public A1() {
			System.out.println("create inner");
		}

		void print() {
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outer.this.name);
		}
	}

	void printOuter() {
		System.out.println(this.name);

		class B1 {
			String name = "B1";

			public B1() {
				System.out.println("create B1");
			}

			void print() {
				System.out.println(this.name);
				System.out.println(Outer.this.name);
			}
		}
		
		new B1();
	}
}