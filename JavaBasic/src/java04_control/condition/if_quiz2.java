package java04_control.condition;

import java.util.Scanner;

//+ 입력한 데이터가 3의 배수인지 판별하시오
//(% 연산자 사용)
//>> Input Number : 7
//>> 3의 배수가 아닙니다

public class if_quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		if( input%3==0 )
		{
			System.out.println("[" + input + "] : 3의 배수입니다.");
		}
		
		if( input%3 != 0 ) {
			System.out.println("[" + input + "] : 3의 배수가 아닙니다.");
		}

			
	}

}
