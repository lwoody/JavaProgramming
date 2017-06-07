package day_5_15;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.print();

		Car car2 = new Car("yellow", "stick", 3);
		car2.print();
		
		//copy of car2
		Car car3 = new Car(car2);
		car3.print();

	}

}
