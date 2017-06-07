package day_5_26;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filecopy1 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		long start = 0;
		long end = 0;

		try {
			fis = new FileInputStream(args[0]); // �������
			fos = new FileOutputStream(args[1]);// ������
			start = System.currentTimeMillis();
			System.out.println("���� ���� �����մϴ�.");
			int readData=0;
			while((readData=fis.read())!=-1){
				fos.write(readData);
			}
			end = System.currentTimeMillis();
			System.out.println("���� ���� ����");
			System.out.println("����ð� : "+(end-start));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (Exception e) {

			}
		}

	}

}
