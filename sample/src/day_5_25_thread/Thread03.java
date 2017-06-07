package day_5_25_thread;

public class Thread03 {
	
	public static void main(String[] args){
		
		System.out.println("Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
}
