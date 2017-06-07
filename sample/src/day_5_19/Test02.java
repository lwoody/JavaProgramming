package day_5_19;

interface Command {
	public abstract void exec();

	default void go() {
		// 필요부분만 오바라이딩 시킬 수 있음
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("delete");
	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("update");
	}

}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("insert");
	}

}

class ListCommand implements Command {

	@Override
	public void exec() {
		System.out.println("list all");
	}

	public void go() {
		System.out.println("go");
	}
}

// class CommandMgr{
//
// public static Command getCommand(String commandName){
//
// if(commandName.equals("insert")){
// return new InsertCommand();
// }
// else if (args[0].equals("delete")){
// return new DeleteCo
// }
// }
// }

public class Test02 {
	public static void main(String[] args) throws Exception {

		Class c = Class.forName(args[0]);
		Command cmd = (Command) c.newInstance();
		cmd.exec();
		cmd.go();//only list
	}

}
