package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		//Quiz. 입력한 숫자가 짝수/홀수인지 판별하는 코드
		if(num%2==0) {
			System.out.println("입력한 숫자"+ num +"는 짝수입니다.");
		} else if(num%2==1){
			System.out.println("입력한 숫자"+ num +"는 홀수입니다.");
		} else if(num==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
				
	}

}
