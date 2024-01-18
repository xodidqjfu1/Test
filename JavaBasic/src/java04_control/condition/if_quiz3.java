package java04_control.condition;

import java.util.Scanner;

//+ 두 수를 입력 받아 큰 수를 출력하시오
//>> Input Number1 : 44
//>> Input Number2 : 88
//>> 88 이 더 큰 수

public class if_quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number 1: ");
		int input1 = sc.nextInt();

		System.out.print("Input Number 2: ");
		int input2 = sc.nextInt();
		
		if ( input1 > input2) { //input1이 큰 경우
			System.out.println( "더 큰 숫자 :" + input1 );
		}
		
		if ( input1 < input2) { //input2이 큰 경우
			System.out.println("더 큰 숫자 :" + input2);
		}
		
		if ( input1 == input2) { //숫자가 같다면
			System.out.println("두 숫자가 일치합니다.");
		}

	}

}
