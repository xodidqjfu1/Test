package java03_scanner;

import java.util.Scanner;

import java01_variables.Variables_01;

//** import 선언코드
//  -> 현재 소스코드에서 java.tuil.Scanner 클래스의 이름을
//  패키지를 생랴한 Scanner로 사용하겠다는 선언

public class Scanner_01 {
	public static void main(String[] args) {

		// class Scanner(스캐너 클래스)
		
		// 키보드로 입력한 내용을 프로그램 데이터로 가져오는 기능 클래스
		
		// 입력 기능 클래스
		// 기존것들은 기본형, 스캐너 클래스는 참조형
		//--------------------------------------------------------------
		
		//기본형 변수
		int num; //int형 변수 선언
		num = 123; //int값 대입
		
		//--------------------------------------------------------------
		
		//참조형 변수
		java.util.Scanner input;
		
		Scanner sc;
		
		sc = new Scanner( System.in ); // SC [위치,주소], Scanner (입력 기능 생성)
		
		
		// new Scanner() : 입력 기능 생성(활성화) _ 객체 (메모리)
		// System.in : 키보드
		
		System.out.println( sc );
		
		Variables_01 v01 = new Variables_01();
		
		System.out.println( v01 );
		
		//java01_variables.Variables_01@5a01ccaa (패키지.클래스at주소)
		
		// ** Organize Imports (import 정리) : ctrl + shift + o
		
		//--------------------------------------------------------------
		
		// sc : 키보드 입력 기능 객체
		// nextInt() : 정수값 추출하여 프로그램으로 가져오는 기능
		
		//sc.nextInt();
		
//		System.out.print("숫자를 입력하세요 : ");		
//		int data = sc.nextInt();		
//		System.out.println("입력된 값 : " + data);
		
		System.out.println("------------------------");
		
		System.out.print("실수값 입력 : ");
		
		System.out.println("입력한 실수 : " + sc.nextDouble());
		
		
		sc.close();
	}

}
