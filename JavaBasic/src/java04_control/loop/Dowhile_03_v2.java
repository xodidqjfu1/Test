package java04_control.loop;

import java.util.Scanner;

public class Dowhile_03_v2 {

	public static void main(String[] args) {	
	
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
