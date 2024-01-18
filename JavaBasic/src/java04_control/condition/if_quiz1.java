package java04_control.condition;

import java.util.Scanner;

public class if_quiz1 {
	
//  + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//  >> Input Number : -3
//  >> 음수입니다

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input number : ");
		int input = sc.nextInt();
		
		if( input > 0 ){
			System.out.println("양수입니다.");
		}
		
		if( input < 0 ){
			System.out.println("음수입니다.");
		}
		
		if( input == 0 ){
			System.out.println("양수도 음수도 아닙니다.");
		}
		
		
	}
}
