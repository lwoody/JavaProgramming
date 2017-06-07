package day_5_11;

public class TvTest {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println(tv1.color);//instance variable
		System.out.println(Tv.inch);//static variable
		
		Tv.inch = 10;
		
		tv1.display();
		tv1.color = "red";
		
		
	}

}
