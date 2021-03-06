package day_5_27;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import day_5_24.PhoneInfo;

public class ObjectSerialize {

	public static void main(String[] args) {

		Date date = new Date();
		ArrayList<PhoneInfo> phones = new ArrayList<>();
		phones.add(new PhoneInfo("fdsa1","010-2242-3213"));
		phones.add(new PhoneInfo("fdsa2","010-2242-3413"));
		phones.add(new PhoneInfo("fdsa3","010-2242-3538"));
		
		// ObjectOutputStream
		FileOutputStream fos = null;
		ObjectOutputStream oo = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("date.ser");
			bos = new BufferedOutputStream(fos);
			oo = new ObjectOutputStream(bos);

			oo.writeObject(date);
			oo.writeObject(phones);
			
			System.out.println("객체가 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//자원 반납 꼭 해주기 - 위의  null assign을 밖에서 꼭 해줘야함
			try {
				if(oo!=null)oo.close();
				if(fos!=null)fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
