package day_5_17;

public class Dog extends Animal {

	String kind; // ������ ����
	String name;

	public Dog() {
		super("��������");
	}
	
	public Dog(String kind,String name){
		this("��������",kind,name);
	}

	public Dog(String kind1, String kind2, String name) {
		// super(); �����Ǿ� ����
		// super.setKind(kind1);
		super(kind1);// �θ� Ŭ������ ����Ʈ ������ �ʿ� ������
		this.kind = kind2;
		this.name = name;
	}

	public void print() {
		System.out.printf("Dog[%s,%s,%s]%n", super.getKind(), this.kind, this.name);
	}

}