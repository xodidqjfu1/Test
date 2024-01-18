package java03_scanner;

import java.util.Scanner;

public class Scanner_02 {
	public static void main(String[] args) {
		
		// 문자열(String) 입력 받기
		
		// 1. jave.util.Scanner(입력재체 변수 선언)
		Scanner in;
		
		// 2. new (입력객체 생성,입력기능 활성화)
		in = new Scanner( System.in) ;
				
		// 3. nextLine() 메소드 - 문자열(String) 입력
		System.out.print("문자열 입력 : ");
		String str = in.nextLine();
		
		// 4. 입력받은 문자열 출력하기
		System.out.print("입력한 문자열 : " + str);
		
			
	}

}
