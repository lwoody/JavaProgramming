package day_5_19_TV;

public class TVuser {

	public static void main(String[] args) {
		
		TV controller1 = new STV();
		TV controller2 = new LTV();
		
		controller1.on();
		controller1.off();
		controller2.on();
		controller2.off();
		
	}

}
