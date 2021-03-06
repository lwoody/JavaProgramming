package day_5_27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

import day_5_24.PhoneInfo;

public class ObjectSerialize2 {

	public static void main(String[] args) throws Exception {
		
		//reading Object - ObjectInputStream
		FileInputStream fis = new FileInputStream("date.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream oi = new ObjectInputStream(bis);
		
		//instanceof로 타입체크 및 캐스팅 해주기
		Date data = (Date) oi.readObject();
		//PhoneInfo data2 = (PhoneInfo) oi.readObject();
		Object obj = oi.readObject();
		ArrayList<PhoneInfo> phones = null;
		if(obj instanceof ArrayList<?>){
			phones = (ArrayList<PhoneInfo>) obj;
		}
		System.out.println(data);
		System.out.println(phones.size());
		System.out.println(phones);
		
		
	}

}
