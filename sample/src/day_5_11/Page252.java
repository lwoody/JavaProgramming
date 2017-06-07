package day_5_11;

public class Page252 {
	
	static String name;//static은 static 영역으로 따로 보관됨

	public String msg(String name) {
		
		return "안녕하세요. " + Page252.name + "님!";
		
	}
	
	public void msgPrint(String name, int num){
		for(int i=0;i<num;i++){
			System.out.println(this.msg(name));
		}
		return;
	}

	public int max(int num1, int num2) {

		if (num1 > num2) {
			return num1;
		}

		return num2;
	}

	public void maxPrint(int num1, int num2) {

		System.out.println(this.max(num1, num2));
		return;

	}

	public static void main(String[] args) {

		Page252 m = new Page252();
		
		System.out.println("========");
		int n1 = 100, n2 = 200;
		m.maxPrint(n1, n2);
		
		System.out.println("========");
		String hello =m.msg("lee");
		System.out.println(hello);		
		
		System.out.println("========");
		m.msgPrint("lee",3);

	}

}
