package day_5_02;

public class Multi {

	public static void main(String[] args) {

		LOOP : for (int i = 1; i < 10; i++) {
			
			
			for (int j = 2; j < 10; j++) {
				if(j==5){
					break LOOP;
				}
				System.out.printf("%d*%d=%2d | ", j, i, i * j);
			}
			System.out.println();
		}

	}

}
