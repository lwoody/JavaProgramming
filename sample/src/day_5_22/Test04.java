package day_5_22;

public class Test04 {

	// ���ٽ� == �͸� �Լ�
	// ������ �Լ� ����� ��� ����

	public static void main(String[] args) {

		Controller delete = new Controller() {

			@Override
			public void exec() {
				System.out.println("delete");
			}

		};
		
		//block
		Controller update = () -> {
				System.out.println("update");
		};
		
		//single line
		Controller insert = () -> System.out.println("insert");
		
		Controller[] array = {delete,update,insert};
		delete.exec();
		update.exec();
		insert.exec();
		array[2].exec();

	}

}

@FunctionalInterface
interface Controller {
	public abstract void exec();
}