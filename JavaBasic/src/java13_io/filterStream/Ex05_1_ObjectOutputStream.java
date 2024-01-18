package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex05_1_ObjectOutputStream {

	public static void main(String[] args) {
		
		//파일 객체
		File file = new File("./src/java13_io/filterStream/" , "ObjectTest.ser");
		
		//객체 출력 스트림
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
			//출력에 사용될 데이터 객체
			Point p1 = new Point(11, 22);
			
			//객체 출력
			oos.writeObject(p1);
			oos.writeObject(new Point(111,222));
			oos.writeObject(new Point(11111,22222));
			
			
			ArrayList<Point> list = new ArrayList<>();
			
			list.add(new Point());
			list.add(new Point(33, 44));
			list.add(new Point(333, 444));
			
			//컬렉션 객체 출력
			oos.writeObject(list);
			
			//------------------------------------------------------
			
			//출력 버퍼 비우기
			oos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(oos != null) oos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
