package day_5_24;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<PhoneInfo> set = new HashSet();
		// index ���� ���� for loop �ȵ� -> iterator �ʼ�

		try (Scanner sc = new Scanner(new File("test.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(":");
				set.add(new PhoneInfo(data[0], data[1]));
			}
		} catch (Exception e) {
			System.out.println("���� Ȯ��");
		}

		Iterator<PhoneInfo> i = set.iterator();
		while (i.hasNext()) {
			PhoneInfo p = i.next();
			if (p.getName().equals("woojae")) {
				i.remove();
			} else {
				System.out.println(p);
			}
		}

	}

}
