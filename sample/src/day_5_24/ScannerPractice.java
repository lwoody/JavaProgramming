package day_5_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = null;
		try {
			sc2 = new Scanner(new File("test.txt"));
			while(sc2.hasNextLine()){
				String data = sc2.nextLine();
				String[] p = data.split(":");
				PhoneInfo phoneData = new PhoneInfo(p[0],p[1]);
				System.out.println(phoneData);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 확인해주세요");
		} finally {
			if (sc2 != null) {
				sc2.close();
			}
		}

		System.out.println("=== main end ===");

	}

}
