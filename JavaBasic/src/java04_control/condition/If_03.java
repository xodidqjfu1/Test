package java04_control.condition;

import java.util.Scanner;

public class If_03 {
	public static void main(String[] args) {
		
		// 스캐너(입력) + 조건문 2개를 활용한 예제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		if( input>=1 && input<=100) {
			System.out.println("입력한 값은 1~100 사이의 정수입니다.");
		}
		
		if( !(input>=1 && input<=100) ) { // 반대의 경우 부정형(!)를 앞에 붙여주고 괄호로 감싸주기
			System.out.println("입력한 값은 1~100 사이의 정수가 아닙니다.");
			
		}
		
		
		
		
	}

}
