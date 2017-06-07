package day_5_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Page418 {

	public static void main(String[] args) {
		System.out.println("start");

		try (FileInputStream fis = new FileInputStream("test.txt")) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("ÀÚ¿ø ¹Ý³³");
			// System.out.println(fis);
		}

		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("end");
	}

}
