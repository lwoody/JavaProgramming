package day_5_17;

public class Dog extends Animal {

	String kind; // 강아지 종류
	String name;

	public Dog() {
		super("강아지과");
	}
	
	public Dog(String kind,String name){
		this("강아지과",kind,name);
	}

	public Dog(String kind1, String kind2, String name) {
		// super(); 생략되어 있음
		// super.setKind(kind1);
		super(kind1);// 부모 클래스에 디폴트 생성자 필요 업어짐
		this.kind = kind2;
		this.name = name;
	}

	public void print() {
		System.out.printf("Dog[%s,%s,%s]%n", super.getKind(), this.kind, this.name);
	}

}