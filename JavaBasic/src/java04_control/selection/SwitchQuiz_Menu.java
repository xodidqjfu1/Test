package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {

	public static void main(String[] args) {
		//   - 메뉴 만들기
		//
		//   ===============================
		//		      M  e  n  u
		//   ===============================
		//	 1. Hello World 출력
		//	 2. 이름 출력
		//	 3. 성별 출력
		//	 4. 종료
		//   ===============================
		//
		//		     >> _
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

		int num;
		Scanner sc = new Scanner(System.in);
		String name = "김김김";
		String gender = "남";
		
		
		
		
		while(true) {
			System.out.println("=======================");
			System.out.println("\tM e n u");
			System.out.println("=======================");
			System.out.println("1. Hello World 출력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 성별 출력");
			System.out.println("4. 종료");
			System.out.println("=======================");
			System.out.print(">> ");
			
			num = sc.nextInt(); 
			
			System.out.print(">>");
			switch(num) {
				
				
			case 1:
				System.out.println("Hello World");
				break;
			case 2:
				System.out.println(name);
				break;
			case 3:
				System.out.println(gender);
				break;
			case 4:
				break;
			default:
				System.out.println("1번부터 4번까지만 입력해주세요");
			
			}
			if(num==4) {
				break;
			}
		}
	
	}

}
