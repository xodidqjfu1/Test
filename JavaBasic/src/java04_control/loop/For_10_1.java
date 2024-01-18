package java04_control.loop;

public class For_10_1 {

	public static void main(String[] args) {
		
		//Quiz. 2~9단 구구단 출력
		//1. 바깥쪽 for문
		//	2~9단 반복
		
		//2. 안쪽 for문
		//	각 단수에 맞는 구구단 출력
		
		//단 진행 반복
		for(int dan=2; dan<=9; dan++) {// dan, 2~9, 8번
			
			//구구단 출력
			for(int j=1; j<=9; j++) { // j, 1~9
				System.out.print(dan + "x" + j + "=" + (dan*j) + "\t");
			}
			System.out.println();
		}
		
	}

}
