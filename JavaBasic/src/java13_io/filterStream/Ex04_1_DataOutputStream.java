package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {

	public static void main(String[] args) {
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		System.out.println("exists : " + file.exists());
		//데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			//Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream -> File
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
			//OutputStream의 기본 출력 메소드
			//	->1B 단위로 ASCII 코드를 처리한다
//			dos.write(65);
//			dos.write("Apple".getBytes()); //"Apple"
			
			//DataOutputStream의 자료형 유지 출력 메소드
			dos.writeBoolean(false);
			dos.writeInt(123);
			dos.writeChar('가');
			
			//출력 버퍼 비우기
			dos.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
