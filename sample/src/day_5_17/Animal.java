package day_5_17;

public class Animal {

	private String kind; // 동물의 종류

//	public Animal() {
//		// super();
//	}

	public Animal(String kind) {
		// super();
		this.kind = kind;
	}

	public void breath() {
		System.out.println("breath");
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//for override
	public void print(){
		
	}

}
