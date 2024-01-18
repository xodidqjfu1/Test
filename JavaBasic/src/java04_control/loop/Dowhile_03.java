package java04_control.loop;

import java.util.Scanner;

public class Dowhile_03 {

	public static void main(String[] args) {
		
		
		//숫자를 여러 개 입력받아 모든 값들의 총합을 구하고
		// 최종 합계를 출력하는 프로그램
		
		//	-> 숫자 0을 입력하면 종료
		
		//	-> do-while 구문 활용하기
		//-----------------------------------------------------------
		
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력하시오(0을 입력하면 종료): ");
			num = sc.nextInt();
			sum += num;
			
			
			
		} while (num != 0);
		System.out.println(sum);
	}

}
