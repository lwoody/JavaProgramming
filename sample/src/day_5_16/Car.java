package day_5_16;

public class Car {

	private String color;
	private String gearType;
	private int door;

	public Car() {
		this("white", "auto", 4);
	}

	public Car(Car c) {
		this(c.getColor(), c.getGearType(), c.getDoor());
	}

	public Car(String color, String gearType, int door) {
		// super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	public void print() {
		System.out.printf("Car[color :%s, gearType :%s, door :%d]%n", this.color, this.gearType, this.door);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	// test
	public static void main(String[] args) {

		Car c1 = new Car("black", "auto", 3);

		c1.print();

		Car c2 = new Car(c1);
		c2.print();

	}

}
