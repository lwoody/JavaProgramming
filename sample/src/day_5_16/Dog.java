package day_5_16;

public class Dog extends Animal {

	String kind = "dog";
	String name;
	// String parentKind = super.kind;

	public void print() {
		System.out.printf("Dog[kind: %s,name :%s]%n", this.kind, this.name);
	}

	String superKind() {
		return super.kind;
	}

}

class ADog extends Dog {

	String kind = "ADog";
	String parentKind = superKind();

	public void print() {
		System.out.println(parentKind);
	}

	public void aa() {
		System.out.println(parentKind);
	}

}
