package day_5_17;

public class AnimalTest {

	public static void main(String[] args) {

		Dog d1 = new Dog("��������", "��찳", "����");
		Dog d2 = new Dog();
		Dog d3 = new Dog("������", "����");

		Dog[] dogs = { d1, d2, d3 };

		Cat c1 = new Cat("����", "������");
		Cat c2 = new Cat("��", "ooo");

		Cat[] cats = { c1, c2 };

		Animal[] animals = { d1, d2, d3, c1, c2 };

		for (Dog data : dogs) {
			data.print();
		}
		for (Cat data : cats) {
			data.print();
		}

		System.out.println("============");
		for (Animal data : animals) {
			
			data.print();
			
//			if (data instanceof Cat) {
//				data.breath();
//				((Cat) data).print();
//			}
		}
//
//		System.out.println("============");
//		
//		Fish f1 = new Fish("����","dd");
//		f1.print();
//		f1.breath();
//		((Animal)f1).breath();
		
	}

}
