package Practice;

import java.util.ArrayList;

import Practice.Outer.Inner;

abstract class Shape {
	private int numSides;

	public Shape(int numSides) {
		this.numSides=numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	abstract double getArea();

}

interface Resizable {
	public abstract void resize(double s);
}

class RecTriangle extends Shape {

	double width;
	double height;

	public RecTriangle(double w, double h) {
		super(3);
		this.height = h;
		this.width = w;
	}

	@Override
	double getArea() {
		return width * height * 0.5;
	}

}

class Rectangle extends Shape implements Resizable {

	double width;
	double height;

	public Rectangle(double w, double h) {
		super(4);
		this.height = h;
		this.width = w;
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;
	}

	@Override
	double getArea() {
		return width * height;
	}

}


class Outer { 
class Inner{
int  iv=100;
}
}

public class WooJaeProb_5_19 {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 6);
		RecTriangle recTriangle = new RecTriangle(6, 2);

		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(rectangle);
		list.add(recTriangle);

		for (Shape data : list) {
			System.out.println("area: " + data.getArea());
			if (data instanceof Resizable) {
				((Resizable) data).resize(0.5);
				System.out.println("new area: " + data.getArea());
			}
		}
		
		Outer.Inner temp = new Outer().new Inner();
		System.out.println(temp.iv);

	}

}
