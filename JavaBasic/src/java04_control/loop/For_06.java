package java04_control.loop;

import java.util.Scanner;

public class For_06 {

	public static void main(String[] args) {
		
		//Quiz
		//구구단 2단 출력하기
		
		//출력 예시)
		//	2 x 1 = 2
		//	2 x 2 = 4
		//	2 x 3 = 6
		//	2 x 4 = 8
		//	2 x 5 = 10
		//	2 x 6 = 12
		//	2 x 7 = 14
		//.....
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 계산할 숫자: ");
		int num = sc.nextInt();
		
//		int num = 2;
		int score = 0;
		for(int i=1; i<10; i++) {
			score = num*i;
			System.out.println(num + "x" + i + "=" + score);
		}
		
		//-----------------------------------------------------
		
//		int dan = 2;
//		for(int i =1; i<=9; i++) {
//			System.out.println(dan + "x" + i + "=" + (dan*i));
//		}
		
	}

}
