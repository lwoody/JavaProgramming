package day_5_16;

public class DogTest {

	public static void main(String[] args) {
		Object a = new Animal();
		Dog d1 = new Dog();
		ADog d2 = new ADog();

		((Animal) a).breath();// down casting
		// ((Dog) a).breath();// casting error
		d1.breath();
		d1.print();
		d2.print();

		Dog d3 = new ADog();
		System.out.println(((Animal) d3).kind);// up casting(항상 가능)
		System.out.println(a.toString());// object resource
		d3.print();

		Object o1 = "Hello";
		Object o2 = new Dog();
		Object o3 = new Animal();

		if (o2 instanceof Dog) {
			Dog o4 = (Dog) o2;
		}
		if (o3 instanceof Dog) {
			Dog o5 = (Dog) o3;
		}

		String s = "ss";

		typeCheck(d3);

	}

	static public void typeCheck(Object obj) {
		if (obj instanceof ADog) {
			System.out.println("ADog type");
		}
		if (obj instanceof Dog) {
			System.out.println("Dog type");
		}
		if (obj instanceof Animal) {
			System.out.println("Animal type");
		}
	}
}
