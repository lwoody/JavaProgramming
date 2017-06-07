package day_6_2;

class SyncTest{
	
	synchronized void a(){
		for(int i=0; i <30; i++){
			System.out.print("a");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	synchronized void b(){
		for(int i=0; i <30; i++){
			System.out.print("b");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	synchronized void c(){
		for(int i=0; i <30; i++){
			System.out.print("c");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	synchronized void d(){
		for(int i=0; i <30; i++){
			System.out.print("d");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}

class Sync extends Thread{
	
	int num;
	SyncTest s;
	
	public Sync(int num, SyncTest sync){
		this.num = num;
		this.s = sync;
	}
	
	public void run(){
		if(num==1){
			s.a();
		}else if(num==2){
			s.b();
		}else if(num==3){
			s.c();
		}if(num==4){
			s.d();
		}
	}
}


public class SynchronizeTest {

	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		Sync s1 = new Sync(1,s);
		Sync s2 = new Sync(2,s);
		Sync s3 = new Sync(3,s);
		Sync s4 = new Sync(4,s);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
	}

}
