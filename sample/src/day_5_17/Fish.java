package day_5_17;

public class Fish extends Animal {

	String kind;
	String name;

	public Fish(String kind, String name) {
		super("¹°°í±â");
		this.kind = kind;
		this.name = name;
	}

	public void print() {
		System.out.printf("Fish[%s,%s,%s]%n", super.getKind(), this.kind, this.name);
	}

	// method overriding
	@Override
	public void breath() {
		System.out.println("fdsa");
	}
}
