package day_5_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList<PhoneInfo> list = new ArrayList<>();
		
		try (Scanner sc = new Scanner(new File("test.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(":");
				list.add(new PhoneInfo(data[0], data[1]));
			}
		} catch (Exception e) {
			System.out.println("���� Ȯ��");
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			//PhoneInfo list�� �ƴϰ� ������Ʈ ����Ʈ �϶��� ĳ������ ����� �Լ� ��� �����ϰ� ��
			System.out.println(((PhoneInfo) list.get(i)).getName());
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("woojae")) {
				System.out.println(list.get(i));
				list.remove(i);
			}
		}
		
		//iterator
		Iterator<PhoneInfo> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
		
	}

}
