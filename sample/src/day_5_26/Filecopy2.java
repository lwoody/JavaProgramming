package day_5_26;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filecopy2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		long start = 0;
		long end = 0;

		try {
			fis = new FileInputStream(args[0]); // 복사원본
			fos = new FileOutputStream(args[1]);// 복사대상
			start = System.currentTimeMillis();
			System.out.println("파일 복사 시작합니다.");
			int readData=0;
			//버퍼
			byte[] buffer = new byte[1024*1024];
			while((readData=fis.read(buffer))!=-1){
				fos.write(buffer,0,readData);
			}
			end = System.currentTimeMillis();
			System.out.println("파일 복사 종료");
			System.out.println("복사시간 : "+(end-start));
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
