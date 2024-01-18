package java13_io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.Source;

public class FileCopyEx2 {

	public static void main(String[] args) {
		
		//Quiz
		
		//Sorce.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		// -> 파일  복사
		
		//49,520,698 bytes
		
		//Source.txt --> FileCopoy --> Destination.txt
		
//		byte[] buf = new byte[];
		
		
		File src = new File("./src/java13_io/filestream/", "Source.txt");
		File dest = new File("./src/java13_io/filestream/", "Destination.txt");
		System.out.println("exists : " + src.exists());
		
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		int total = 0;
		
		try { //핵심 코드부분 읽고 쓰기
			
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);
			
			//파일 입력
			while((len = fis.read(buf)) != -1) {
				
				//파일 출력
				fos.write(buf, 0, len);
				fos.flush();
				
				//복사된 바이트 수 총합
				total += len;
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		System.out.println();
		System.out.println(">>" + total + "바이트 복사 완료");
		
	}

}
