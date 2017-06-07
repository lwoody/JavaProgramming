package day_5_15;

public class Docu {

	public static void main(String[] args) {

		Doc d1 = new Doc();
		Doc d2 = new Doc("자바");
		Doc d3 = new Doc();
		Doc d4 = new Doc();

	}

}

class Doc {

	private String name;
	static int num=1;

	public Doc() {
		this("제목없음" + num);
		num++;
	}

	public Doc(String name) {
		this.setName(name);
		System.out.println("문서 " + this.getName() + "가 생성되었습니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
