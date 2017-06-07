package day_5_17;

public class Cat extends Animal {

	String kind;
	String name;

	public Cat(String kind, String name) {
		super("고양이과");
		this.kind = kind;
		this.name = name;
	}

	public void print() {
		System.out.printf("Cat[%s,%s,%s]%n", super.getKind(), this.kind, this.name);
	}

}
