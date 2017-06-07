package day_5_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Page417 {

	public static void main(String[] args) {
		System.out.println("start");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("ÀÚ¿ø ¹Ý³³");
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(fis);
		}

		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		System.out.println("end");
	}

}
