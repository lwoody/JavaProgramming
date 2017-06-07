package day_6_2;

public class ThreeThreadTest {
	
	public static void main(String[] args){
		SimpleThread a,b,c;
		a = new SimpleThread("one");
		b = new SimpleThread("one");
		c = new SimpleThread("one");
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
