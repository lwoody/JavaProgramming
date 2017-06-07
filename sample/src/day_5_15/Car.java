package day_5_15;

public class Car {

	private String color;
	private String gearType;
	private int door;
	private String brand;
	int serialNo;
	static int count;
	
	static{
		count=0;
	}
	
	{
		++count;
		this.serialNo=count;
	}
	
	public Car() {
		this("black", "auto", 4);
	}

	public Car(Car c) {
		this(c.getColor(), c.getGearType(), c.getDoor());
	}

	public Car(String col, String gear, int door) {
		this.setColor(col);
		this.setGearType(gear);
		this.setDoor(door);
	}

	public Car(String col, String gear, int door, String brand) {
		this(col, gear, door);
		this.setBrand(brand);
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void print() {
		// System.out.println("color:"+this.color+" gearType:"+this.gearType+"
		// door:"+this.door);
		System.out.printf("Car[color: %s , gearType: %s, door: %d, serialNo: %d]%n", color, gearType, door,serialNo);
	}

}
