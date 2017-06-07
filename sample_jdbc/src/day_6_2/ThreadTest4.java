package day_6_2;

public class ThreadTest4 {

	public static void main(String[] args) {
		RunnableThread2 a = new RunnableThread2("one");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(new RunnableThread2("two"));
		
		t1.start();
		t2.start();
	}

}

class RunnableThread2 implements Runnable{
	
	String name;
	
	public RunnableThread2(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" run-"+i);
		}
		System.out.println(Thread.currentThread().getName()+"done");
	}
	
}