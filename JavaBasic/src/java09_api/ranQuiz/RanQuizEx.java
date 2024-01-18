package java09_api.ranQuiz;

import java.util.Scanner;

public class RanQuizEx {
	
	public static final int UPDOWN = 1;
	public static final int BASKIN = 2;
	public static final int EXIT = 3;

	public static final int SCORE = 5;
	
	public static void main(String[] args) {
		
		//랜덤 퀴즈 메뉴 만들기
		//	1. Up&Down 게임
		//	2. Baskin 31 게임
		//	3. 종료
		//--------------------------------------------
		
		RanQuiz ranQuiz = new RanQuiz();
		
		//게임 실행 메소드
//		ranQuiz.updown();
//		ranQuiz.baskin();
		//--------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		int userWin = 0;
		int comWin = 0;
		
		int menu = 0;
		
		do {
			System.out.println(" - - - - 메뉴 - - - -");
			System.out.println("  1. Up&Down 게임");
			System.out.println("  2. Baskin 31 게임");
			System.out.println("  3. 종료");
			System.out.println("  5. 점수");
			System.out.println();
			System.out.print("  >> ");
			menu = sc.nextInt();
			
			System.out.println();
			System.out.print("  >> ");
			switch (menu) {
			case UPDOWN:
				System.out.println("UP&DOWN GAME");
				
				if( ranQuiz.updown() == RanQuiz.USER_WIN ) {
					userWin++;
				} else {
					comWin++;
				}
				
				break;

			case BASKIN:
				System.out.println("BASKIN 31 GAME");
				
				if( ranQuiz.baskin() == RanQuiz.USER_WIN ) {
					userWin++;
				} else {
					comWin++;
				}

				break;
				
			case EXIT:
				System.out.println("다음에 또 봐요");
				
				break;
				
			case SCORE:
				System.out.println("현재 점수");
				
				System.out.println(" USER : " + userWin);
				System.out.println(" COM : " + comWin);
				
				break;
				
			default:
				System.out.println("올바른 메뉴를 입력하세요");
				
				break;
			}
			
		} while( menu != EXIT );
		
	}
}







