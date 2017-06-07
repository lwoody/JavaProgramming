package day_5_24;

public class Review {
	
	Employee<Circle,Rec> emp1 = new Employee(new Circle(),new Rec());
	

}

//class Employee implements Cloneable{
//	private String anme;
//	private String ssn;
//	
//		
//	
//}


class Employee<T,V extends Number>{
	T name;
	V number;
	public Employee(T name, V number) {
		super();
		this.name = name;
		this.number = number;
	}
	
}

class Number{
	
}

class Circle extends Number{
	
}

class Rec extends Number{
	
}

