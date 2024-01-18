package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		File file1 = new File("", "");
		
		
		//상대 경로 지정
		File file2 = new File("src/java13_io/file/", "Hello");
		
		System.out.println(file2);
		
		System.out.println("exists : " + file2.exists()); //파일의 존재 유무
		System.out.println("length : " + file2.length()); //파일의 크기
		
		System.out.println("---------------------------");
		
		//상대 경로 기준점 == 클래스 패스 == 프로젝트 폴더
		
		//	D:\workspace\JavaBasic\
		
//		File file3 = new File("./src/java13_io/file/../../java10_collection/", "user.properties");
//		System.out.println("exists : " + file3.exists()); //파일의 존재 유무
//		System.out.println("length : " + file3.length()); //파일의 크기
		
//		File file3 = new File("/workspace/JavaBasic/src/java13_io/file/", "Hello");
//		System.out.println("Hello : " + file3.exists());
		
		File file3 = new File("../JavaBasic/src/java13_io/file", "Hello");
		System.out.println("Hello : " + file3.exists());
		
	}

}
