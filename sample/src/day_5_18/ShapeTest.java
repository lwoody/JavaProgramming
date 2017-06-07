package day_5_18;

public class ShapeTest {

	public static void main(String[] args) {
		
		ShapeMgr mgr = new ShapeMgr();
		mgr.exec(new Circle());
		
		Point[] points = {new Point(10,10),new Point(20,20),new Point(50,50)};
		
		mgr.exec(new Triangle(points));
		
	}

}
