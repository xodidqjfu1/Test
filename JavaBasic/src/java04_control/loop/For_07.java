package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		
		   //Quiz.
		//   첫날에 10원을 예금하고,
		//   다음날에는 전날의 2배를
		//   예금하는 방식으로
		//   보름(15일) 동안 저축한 금액은?
		//	      -> 327670
			
		
//-----------------------------------------------------------		
		int i; //날짜
		int money =10;  //예금액
		int sum =0;  //총 금액
		
		
		for(i=1; i<=15; i++) {
			
//			sum += sum + money;
//			sum = sum*2 + money;

			sum += money; //총 금액에 추가하기
//			System.out.println(i + "일, 예금액 : " + money);
//			System.out.println(i + "일, 총금액 : " + sum);
//			System.out.println("-------------------------");
			money *=2; //예금액 2배 증가			
		}
		System.out.println(sum);
//------------------------------------------------------------
	}

}
