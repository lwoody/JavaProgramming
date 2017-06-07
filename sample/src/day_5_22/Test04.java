package day_5_22;

public class Test04 {

	// 람다식 == 익명 함수
	// 변수에 함수 등록후 사용 가능

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