package java13_io.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		File file = new File("./src/java13_io/filestream", "output");
		System.out.println("exists : " + file.exists());
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		try {
			//파일 출력 스트림 생성
			//	-> 출력 대상 파일이 존재하지 않으면 파일을 생성한다
//			fos = new FileOutputStream(file);
			
			
			fos = new FileOutputStream(file, true);
			
			//파일 출력
			String data = "Orange";
			fos.write(data.getBytes(), 0, data.length());
			fos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		finally {
			
			try {
				//스트림 닫기
				if (fos!=null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
	}

}
