package Practice;

class C extends B{
	int meth() {
		return 100;
	}

	static int sMeth() {
		return 100;
	}
}

class B extends A{
	int meth() {
		return 10;
	}

	static int sMeth() {
		return 10;
	}
}

class A{
	int meth() {
		return 1;
	}

	static int sMeth() {
		return 1;
	}
}

class AirUnit extends Unit{}
class Unit{}
class AirCraft extends AirUnit{}
class GroundUnit extends Unit{}
class Tank extends GroundUnit{}

public class Inheritance {

	public static void main(String[] args) {

		C c = new C();
		B b = (B) c;
		A a = (A) c;

		if (a instanceof A) {
			System.out.println("a는 A의 인스턴스이다.");
		}
		if (a instanceof B) {
			System.out.println("a는 B의 인스턴스이다.");
		}
		if (a instanceof C) {
			System.out.println("a는 C의 인스턴스이다.");
		}

		System.out.println(
				a.meth() + " " + b.meth() + " " + c.meth() + " " + a.sMeth() + " " + b.sMeth() + " " + c.sMeth());
		
		Unit u = new GroundUnit();
		AirCraft ac = new AirCraft();
		Tank t  = new Tank();
		
//		u = ac;
//		u=(Unit)ac;
//		t = (Tank)u;
		
		
	}

}
