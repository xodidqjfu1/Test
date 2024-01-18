package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {

	public static void main(String[] args) {
		
		//성능 평가
		//	-> 코드의 수행 시간을 측정한다
		
		// 1. 알고리즘(로직) 시작 전 현재시간 체크 - > start 변수에 저장
		
		// 2. 알고리즘 수행
		
		// 3. 알고리즘(로직) 완료 후 현재시간 체크 - > end 변수에 저장
		
		// 4. 두 시간 차이를 구한다 -> 수행 시간 (end - start)
		
		//-------------------------------------------------------
		
		//** System.currentTimeMillis() : long
		//	현재 시간(Epoch Time)을 밀리초 단위로 반환한다
		
		long start = System.currentTimeMillis()	;
		long end = System.currentTimeMillis()	;
		System.out.println("start : " + start);
		
		File file = new File("./src/java13_io/filestream/", "Source.txt");
		FileInputStream fis = null; //1차 스트림 - 파일 입력
		BufferedInputStream bis = null; //2차 스트림 - 성능 향상
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		
		try {
			
			// FileInputStream으로만 read() 수행하기
			fis = new FileInputStream(file);
			
			start = System.currentTimeMillis();
			while((len = fis.read(buf)) != -1) {
			}
			
			end = System.currentTimeMillis();
			System.out.println("fis : " + (end - start));
			
			//-----------------------------------
			
			//BufferedInputStream으로 연결해서 read() 수행하기
			bis = new BufferedInputStream(new FileInputStream(file));
			
			start = System.currentTimeMillis();
			while((len = bis.read(buf)) != -1) {
			}
			end = System.currentTimeMillis();
			
			System.out.println("bis : " + (end - start));
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
			try {
				if(bis!=null) bis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			try {
				if(fis!=null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
	}

}
