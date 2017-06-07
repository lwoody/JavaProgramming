package day_5_19;

abstract class Shape {

	abstract double getArea(double r);

}

interface Drawable {
	public abstract void draw();
}

interface Colorable {
	public abstract void drawColor(String color);
}

interface DrawAndColorable extends Drawable, Colorable {

}

// public class Circle extends Shape implements Drawable, Colorable{
public class Circle extends Shape implements DrawAndColorable {

	@Override
	double getArea(double r) {
		return r * r * Math.PI;
	}

	@Override
	public void draw() {
		System.out.println("draw Circle");
	}

	@Override
	public void drawColor(String color) {

		System.out.println(color + " color");

	}

	public static void main(String[] args) {
		Circle c = new Circle();
		Shape s = new Circle();
		Drawable d = new Circle();
		c.draw();
		// s.draw();
		((Drawable) s).draw();
		System.out.println(s.getArea(10));
		// d.getArea(10);
		System.out.println(((Shape) d).getArea(10));
		d.draw();
		c.drawColor("Yello");
		
		DrawAndColorable e = new Circle();
		e.draw();
		e.drawColor("Black");

	}

}
