package day_5_22;

public class Page439 {

	public static void main(String[] args) {
		// Employee employee = new Employee("lee", "lwoody@naver.com");
		// Employee emp2 = new Employee("fdsa", "fdsa");

		Employee emp1 = new Employee();
		Employee emp2 = null;
		try {
			emp1.setEmail("lwoody@naver.com");
		} catch (EmailCheckedException e) {
			e.printStackTrace();
		}
		try {
			emp2 = new Employee("ghfd", "");
			emp2.print();
		} catch (EmailCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main end");
		
		try {
			Employee emp3 = new Employee("°í±æµ¿", "ko@nn.com");
		} catch (EmailCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Employee {
	private String name;
	private String email;

	public Employee() {

	}

	public Employee(String name, String email) throws EmailCheckedException {
		this.name = name;
		this.setEmail(email);
		// try {
		// this.setEmail(email);
		// } catch (EmailCheckedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	void print() {
		System.out.println(this.name + " : " + this.email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailCheckedException {
		if (email.indexOf('@') == -1) {
			throw new EmailCheckedException();
		}
		this.email = email;
	}

}

class EmailCheckedException extends Exception {
	EmailCheckedException() {
		super("@ missed");
	}

	EmailCheckedException(String msg) {
		super(msg);
	}
}