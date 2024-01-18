package java02_operator;

public class Ternary {
	
	public static void main(String[] args) {

		//삼항 연산자 - 조건
		
		// ? :
		
		//    조건식 ?조건식이 ture일 때 반환 : 조건식이 false일 때 반환
		
		//    ** 조건식 - 연산의 결과를 true / false로 판단할 수 있는 식
		//-------------------------------------------------------------------
		
		System.out.println( (true) ? "참" : "구라" ); //참
		System.out.println( (false) ? "참" : "구라" ); //거짓

		System.out.println("=========================" );
		
		int num1 = 50, num2 = 20;
		
		System.out.println( num1<num2 ?"num1이 작다." :"num1이 작지 않다." );
		System.out.println( num1<num2 ?"num1이 작다." :"num1이 크거나 같다." );
		
		//--------------------------------------------------------------------

		int res = num1>num2 ?num1 :num2;
		// num1과 num2 중 큰 값을 저장하기 , ** 같은 값은 그 값을 반환한다.
		
		System.out.println( res );
		
			
	}

}
