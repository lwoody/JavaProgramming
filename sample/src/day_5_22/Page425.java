package day_5_22;

public class Page425 {

	public static void main(String[] args) {

		Sample s = new Sample();

		try {
			s.stop("NO");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		s.go();
		
		try {
			s.getIndex('k');
		} catch (NoExitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class NoExitException extends Exception {
	
	NoExitException() {
		super("not exist");
	}

	NoExitException(String errMsg) {
		super(errMsg);
	}
}

class Sample {

	int getIndex(char c) throws NoExitException {
		String data = "hello java test";
		int index = data.indexOf(c);
		if(index == -1){
			throw new NoExitException("fdsafd");
		}
		return index;
	}

	void go() {
		System.out.println("~~~");
	}

	void stop(String msg) throws RuntimeException {
		if (msg.equals("NO")) {
			throw new RuntimeException("Stop 할 수 없음");
		}
		System.out.println("stop");
	}
}