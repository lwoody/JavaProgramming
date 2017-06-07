package day_5_22;

public class Test01 {
	
	public static void main(String[] args){
		A a = new A();
		C c = new C();
		E e = new E();	
	}

}

class A{
	String name;
	void print(){
		System.out.println(this.name);
	}
	
}

abstract class B{
	abstract void print();
	void go(){}
}

class C extends B{

	@Override
	void print() {
		
	}
	
}

interface D{
	final static int i=0;
	public abstract void print();
}

class E implements D{

	@Override
	public void print() {
		
	}
	
}