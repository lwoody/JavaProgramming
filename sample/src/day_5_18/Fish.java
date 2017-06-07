package day_5_18;

public class Fish extends Animal {

	String kind;
	String name;
	
	public Fish(){
		this("물고기",null);
	}

	public Fish(String kind, String name) {
		super("물고기");
		this.kind = kind;
		this.name = name;
	}

	public void print() {
		System.out.printf("Fish[%s,%s,%s]%n", super.getKind(), this.kind, this.name);
	}

	// method overriding
	@Override
	public void breath() {
		System.out.println("no");
	}
}
