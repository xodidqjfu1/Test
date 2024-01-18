package java02_operator;

public class Binary_04 {
	
	public static void main(String[] args) {
		
		//이항 연산자 - 논리
		// &&(AND) , ||(OR). !(NOT)
		
		// !(NOT) 연산자는 단항 연산자
		
		// 논리(boolean) 데이터의 관계를 따져서 결과를 반환한다.
		
		// AND연산은 피연산자가 모두 true일 때 전체 결과가 true
		// OR연산은 피연산자가 둘 중 하나라도 true일 때 전체 결과가 true
		
		// NOT연산은 피연산자의 논리를 부정한다 (반대로 바꾼다)
		
		// XOR (eXclusive-OR) 왼쪽항과 오른쪽항이 서로 다를 경우 true
//		
//		//-----------------------------------------------------------------------
//		
//		boolean b1 = true;
//		boolean b2 = false;
//		
//			System.out.println("true && false :" + (b1&&b2)); // false
//			System.out.println("true || false :" + (b1||b2)); // true	
//			
//		//-----------------------------------------------------------------------
//			
//		int num = 77;
//		
//			System.out.println ( num>=1 );
//			System.out.println ( num<=100 );
//
////			System.out.println ( 1 <= num <= 100 ); //에러
////			▶System.out.println ( boolean <= int ); //불린과 인트가 비교되고 왼쪽항이 기준되야함
//			
//			System.out.println ( (num>=1) && (num<=100) ); 
////                                 (1)   (3)      (2)
//
//			//-----------------------------------------------------------------------
//			
//			num = 2000;
//			
//			System.out.println ( !(num>=1 && num<=100) ); 
			
			//-----------------------------------------------------------------------
			
//			System.out.println ( !(num>=1 ) (&&) !(num<=100) ); 
//			▼ System.out.println ( num<1  || num>100 ); 
			
			//** !(논리부정) 연산자의 적용
			//   ㄴ 관리연산자를 반대 조건으로 치환한다.
			//   ㄴ 논리연산자를 &&->||, ||->&&로 각각 치환한다.
			//   <(LT)의 반대는 >(GT)가 아니다. >=(GE),크거나 같다가 맞다.
                             
	}

}
