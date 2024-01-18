package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//---------------------------------------------------		
		
		//Scanner를 이용한 char 값 처리하기
		// -> Scanner클래스에는 char를 직접 입력 처리하는 기능이 없다.
		
		// -> String타입은 char형 데이터를 나열해놓은 구조이다.
		// -> String으로 입력받은 문자열의 첫 글자를 char형으로 사용한다.
		
//---------------------------------------------------		
		System.out.println("--- 입력 ---");
		
//		String str = new String("Apple Banana");
		String str = "Apple Banana";
//             ▶----------▼ 	
		char returnData = str.charAt(8); //index(순번) _ 0번부터 시작,띄어 쓰기도 문자판정(ASCII /n)
		System.out.println("8번째 인덱스 : " + returnData);
		
		returnData = str.charAt(0);
		System.out.println("첫 글자 : " + returnData);

		System.out.println("----------------");

		System.out.print("Input : ");
		String data = sc.nextLine();
		
		System.out.println( data.charAt(0));
		
		System.out.println("----------------");
		System.out.print("Input : ");
		char charData = sc.nextLine().charAt(0); // 스트링과 캐릭터
		
		System.out.println(charData);
		
	}
}
