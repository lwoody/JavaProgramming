package Practice;


class Parent {
int x = 100;
void method() {
System.out.println("Parent Method");
}
}
class Child extends Parent {
int x=200;

void method() {
	
System.out.println("Child Method");
}
}


abstract class Shape2 {
	private String name;
	protected double area;

	public Shape2() {
		this(null);
	}

	public Shape2(String name) {
		this.setName(name);
	}

	abstract void calculationArea();

	public void print() {
		System.out.println(this.name + "의 면적은 " + this.area);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}

class Circle extends Shape2 {
	private double radius;

	public Circle(String name, double radius) {
		this.setName(name);
		this.setRadius(radius);
	}

	@Override
	public void calculationArea() {
		setArea(this.radius * this.radius * Math.PI);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}

class Rectangular extends Shape2 {
	private double width;
	private String height;

	public Rectangular(String name, double width, String height) {
		this.setHeight(height);
		this.setName(name);
		this.setWidth(width);
	}

	@Override
	public void calculationArea() {
		setArea(this.width * (double) Integer.parseInt(this.height));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}

public class WooJaeProb_5_18 {

	public static void main(String[] args) {
		Shape2[] shape = new Shape2[2];

		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangular("직사각형", 10, "20");

		for (int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
		
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();

	}

}



