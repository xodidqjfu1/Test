package java04_control.loop;

public class For_05 {

	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		// -> 55
		//--------------------------------------
		int i;
		int tot = 0;
		for(i=1; i<=10; i++) {
			tot= tot + i;
			
		}
		System.out.println(tot);
		
		//반복횟수 : 10
		//반복구간 : 1~10
	}

}
