package day_5_18;

import java.util.Arrays;

class Shape {

	String color = "black";

	void draw() {
		System.out.println("도형 그리기");
	}

}

class Point {
	int x, y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getXY() {
		return "(" + this.x + "," + this.y + ")";
	}

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}

class Circle extends Shape {

	Point center;
	int r;

	// static test
	static void dd() {
		(new Circle()).draw();
	}

	public Circle() {
		this(new Point(0, 0), 0);
	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle(Point center, int r, String color) {
		this(center, r);
		this.color = color;
	}

	public void draw() {
		System.out.printf("Circle[color : %s, center : %s, radus : %d]%n", this.color, this.center.getXY(), this.r);
		super.draw();
	}

}

class Triangle extends Shape {

	Point[] points = new Point[3];

	public Triangle() {
		this(new Point(0, 0), new Point(0, 0), new Point(0, 0));
	}

	public Triangle(Point p1, Point p2, Point p3) {
		Point[] points = { p1, p2, p3 };
		this.points = points;
	}

	public Triangle(Point p1, Point p2, Point p3, String color) {
		this(p1, p2, p3);
		this.color = color;
	}

	public Triangle(Point[] points) {
		this.points = points;
	}

	public Triangle(Point[] points, String color) {
		this(points);
		this.color = color;
	}

	public void draw() {
		/*
		 * System.out.printf(
		 * "Trianlge[color : %s, point1 : %s, point12 : %s, point3 : %s]%n",
		 * this.color, this.points[0].getXY(), this.points[1].getXY(),
		 * this.points[2].getXY());
		 */
//		 toString override
		System.out.printf("Triangle[color : %s, points : %s]%n", this.color, Arrays.toString(this.points));
		super.draw();
	}

}

public class Page318 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(5, 5), 7, "Yellow");

		Point[] points = { new Point(5, 5), new Point(0, 0), new Point(5, 0) };
		Triangle t1 = new Triangle(points);
		Triangle t2 = new Triangle(points, "Yellow");

		Shape[] shapes = { c1, c2, t1, t2 };

		for (Shape data : shapes) {
			data.draw();
		}

		/*
		 * static using test Circle.dd();
		 */
	}

}
