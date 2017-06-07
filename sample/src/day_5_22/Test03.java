package day_5_22;

public class Test03 {

	public static void main(String[] args) {

		// inner class
		Command cmd1 = new Test03().new Updatecommand();

		// anonymous class
		Command cmd2 = new Command() {

			@Override
			public void exec() {
				System.out.println("Deletecommand");
			}

		};
		cmd1.exec();

		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("Update");
			}

		};

		Command insert = new Command() {

			@Override
			public void exec() {
				System.out.println("insert");
			}

		};

	}

	class Updatecommand implements Command {

		@Override
		public void exec() {
			System.out.println("Updatecommand");
		}

	}

	class Deletecommand implements Command {

		@Override
		public void exec() {
			System.out.println("Deletecommand");
		}

	}

}

@FunctionalInterface
interface Command {
	public abstract void exec();
}
