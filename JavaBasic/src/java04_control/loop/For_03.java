package java04_control.loop;

public class For_03 {

	public static void main(String[] args) {
		
//		for(int num=10; num>=1; num--) {
//			System.out.println(num);
//		}
		
		//num 변수가 10부터 1보다 크거나 같은 동안 1씩 줄어든다
		//반복횟수 : 10
		//반복구간 : 10~1
		//------------------------------------------------------
		
		for(int i =0; i<10; i+=2) {
			System.out.println(i);
		}
		
		// i변수가 0부터 10보다 작은 동안 2씩 증가
		
		// 반복횟수 : 5
		// 반복구간 : 0 2 4 6 8
	}

}
