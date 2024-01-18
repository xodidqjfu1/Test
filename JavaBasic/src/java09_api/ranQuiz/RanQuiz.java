package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuiz {
	public static final int USER_WIN = 1;
	public static final int COM_WIN = 2;
	
	private Random ran = new Random(); //랜덤 객체
	private Scanner sc = new Scanner(System.in); //키보드 입력 객체

	private int com;
	private int user;
	
	public int updown() {
		
//		System.out.println("=============== START ===============");
		com = ran.nextInt(50) + 1; //컴퓨터의 랜덤 숫자 생성, 1~50
//		System.out.println("[TEST] " + com);
		
		
		//7번의 기회
		for(int count=0; count<7; count++) {
			
			//사용자의 입력
			while( true ) {
				System.out.print("1~50 중 하나 입력 : ");
				user = sc.nextInt();
				
				if( user >=1 && user <= 50 ) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~50 범위의 숫자만 입력하세요!");
				}
			}
			
			//컴퓨터 랜덤 숫자(com)와 사용자 입력(user) 숫자 비교
			if( com > user ) {
				//컴퓨터가 클 경우	-> UP출력
				System.out.println("UP");
				
			} else if( com < user ) {
				//컴퓨터가 작을 경우	-> DOWN 출력
				System.out.println("DOWN");
				
			} else {
				//같을 경우	-> 사용자 승리
				System.out.println("이겼습니다!");
				
				return USER_WIN;
			}
			
		} //7번의 기회 for end
		
		System.out.println("졌습니다");
		System.out.println("컴퓨터는 [" + com + "] 입니다");

		return COM_WIN;
	}
	
	public int baskin() {
		
		int num = 1;	//게임 진행 숫자
		int max = 31;	//게임 종료 숫자 (정상)
//		int max = 11;	//게임 종료 숫자 (테스트)
		
		//승자 체크 변수
		//	-> 1: user승
		//	-> 2: com승
		int winner = 0;
		
//		System.out.println("=============== START ===============");
		GAME:
		while( num<=max ) {
			
			//--- 컴퓨터의 숫자 말하기 ---
			//컴퓨터의 보정값
			//	-> 랜덤을 무시하고 컴퓨터가 이길 수 있는 연속 숫자까지만 출력함
			if( max-num >= 1 && max-num <= 3 ) {
				com = max-num;
//				System.out.println("[TEST] com 보정됨 : " + com);
				
			} else {
				com = ran.nextInt(3) + 1;	//컴퓨터가 출력할 연속 숫자의 개수, 1~3
//				com = 3;	//테스트
//				System.out.println("[TEST] com 랜덤 : " + com);
				
			}
			
			for(int i=0; i<com; i++) {
				System.out.println("com >> " + num++);
				
				if( num>max ) {
					winner = USER_WIN;	//사용자의 승리 체크
					break GAME;
				}
			}
			
			//--- 사용자의 숫자 말하기 ---
			//1~3입력할 때까지 반복
			while( true ) {
				System.out.println();
				System.out.print(">> 몇 개 연속? ");
				user = sc.nextInt();
				
				if( user >= 1 && user <= 3 ) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~3만 입력하세요");
				}
			}
			
			for(int i=0; i<user; i++) {
				System.out.println("user >> " + num++);
				
				if( num>max ) {
					winner = COM_WIN; //컴퓨터의 승리 체크
					break GAME;
				}
			}
			
		} // while end, 게임 진행 반복문 (max까지)
		

		//승자 출력
		System.out.println();
		if( winner == USER_WIN ) {
			System.out.println("  >> 사용자가 승리하였습니다");

			return USER_WIN;
			
		} else {
			System.out.println("  >> 컴퓨터가 승리하였습니다");
			
			return COM_WIN;
		}

	}
	
}
