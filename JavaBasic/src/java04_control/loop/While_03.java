package java04_control.loop;

public class While_03 {

	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		//	-> 2~9단 전부 출력
		
		int dan=2;
		while(dan<=9) {
			
			int x = 1;
			while(x<=9) {
				
				System.out.println(dan + "x" + x + "=" + (dan*x));
				x++;
			}
			dan++;
			System.out.println("-------------");
		}
		
	}

}
